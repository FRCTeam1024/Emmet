package org.usfirst.frc1024.Emmet.commands;

import org.usfirst.frc1024.Emmet.subsystems.Drivetrain;
import org.usfirst.frc1024.Emmet.subsystems.Gripper;
import org.usfirst.frc1024.Emmet.subsystems.Lifter;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TeleopMoveBack extends Command {
Boolean isDone;
    public TeleopMoveBack() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	isDone=false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(isDone==false){
    		Drivetrain.DriveMotors(0.5, 0.5, 0);
    		Lifter.Up(1);
    		Timer.delay(1);
    		Drivetrain.Stop();
    		Lifter.Stop();
    		Gripper.Close();
    		isDone=true;
    	}
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
