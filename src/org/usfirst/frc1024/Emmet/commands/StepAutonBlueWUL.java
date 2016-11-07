package org.usfirst.frc1024.Emmet.commands;

import org.usfirst.frc1024.Emmet.Robot;
import org.usfirst.frc1024.Emmet.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StepAutonBlueWUL extends Command {
boolean isDone;
    public StepAutonBlueWUL() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	isDone = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(isDone==false){
    		Drivetrain.stepCommonWU(Robot.blueStepDistanceWU);
        	Drivetrain.turnLeft(0.25, -85); //turn to be able to set down containers
        	Drivetrain.DriveStraightInches(0.4, 24); //get out of 234's way
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
