package org.usfirst.frc1024.Emmet.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1024.Emmet.Robot;
import org.usfirst.frc1024.Emmet.subsystems.Drivetrain;

/**
 *
 */
public class  Drive extends Command {

    public Drive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
	protected void execute() {
		//quarter speed
    //	if((Robot.oi.lJoy.getRawButton(1)==true)){
    	//	Robot.tankDownsize=4;
    	//	Robot.slideDownsize=4/3;
    	//turbo mode
    	if((Robot.oi.lJoy.getRawButton(2) == true)){
    		Robot.tankDownsize=1;
    		Robot.slideDownsize=1;
    	//regular
    	}else{
    		Robot.tankDownsize=4/3;
    		Robot.slideDownsize=1;
    	}
    	Drivetrain.DriveMotors((Robot.oi.lJoy.getRawAxis(1))/(Robot.tankDownsize),
    						   (Robot.oi.rJoy.getRawAxis(1))/(Robot.tankDownsize),
    						  ((Robot.oi.rJoy.getRawAxis(0)))/(Robot.slideDownsize));
    	}

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
