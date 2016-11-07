package org.usfirst.frc1024.Emmet.commands;

import org.usfirst.frc1024.Emmet.subsystems.Drivetrain;
import org.usfirst.frc1024.Emmet.subsystems.Gripper;
import org.usfirst.frc1024.Emmet.subsystems.Lifter;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class BackupAuton extends Command {
Boolean isDone;
    public BackupAuton() {
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
    	Gripper.Open(); //open the gripper to grab container
    	Timer.delay(0.2);
		Drivetrain.DriveStraightInches(0.5, 12); //drive to the container
		Gripper.Close(); //grab the container
		Lifter.Up(1);
		Timer.delay(0.4);
		Lifter.Stop();
		Drivetrain.DriveStraightInches(1, 36); //get the heck out of the way
		Drivetrain.DriveStraightInches(0.4, 60); //drive over the scoring platform
		Drivetrain.Stop();
		Lifter.Down(1); //put the container on the ground
		Timer.delay(1); //wait for the lifter to reach the bottom E-stops
		Lifter.Stop();
		Gripper.Open(); //release the container
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
