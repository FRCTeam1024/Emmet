package org.usfirst.frc1024.Emmet.commands;

import org.usfirst.frc1024.Emmet.Robot;
import org.usfirst.frc1024.Emmet.subsystems.Drivetrain;
import org.usfirst.frc1024.Emmet.subsystems.Wings;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StepAutonBumpSwitchRight extends Command {
boolean isDone;
    public StepAutonBumpSwitchRight() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Drivetrain.gyro.reset();
    	isDone=false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(isDone==false){
    		Wings.SetFast();
    		Wings.Down();
    		while((Wings.stepButton.get()==true) && (Drivetrain.leftEncoder.getDistance()>-58*Robot.encoderConstantInches) && (Robot.oi.xBox.getRawButton(2)==false)){
    			Drivetrain.DriveMotors(1+(Drivetrain.gyro.getAngle()/20), 1-(Drivetrain.gyro.getAngle()/20), 0);
    		}
    		Drivetrain.Stop();
    		Wings.Up();
    		Timer.delay(0.5);
    		Wings.SetSlow();
    		Drivetrain.DriveStraightInches(0.35, 148);
    		Drivetrain.turnRight(0.25, 85);
    		Drivetrain.Stop();
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
