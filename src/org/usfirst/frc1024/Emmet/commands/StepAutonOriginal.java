package org.usfirst.frc1024.Emmet.commands;

import org.usfirst.frc1024.Emmet.subsystems.Drivetrain;
import org.usfirst.frc1024.Emmet.subsystems.Wings;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class StepAutonOriginal extends Command {
boolean isDone;
    public StepAutonOriginal() {
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
        	Drivetrain.DriveStraightInches(0.35, -53); //Drive to step
        	Drivetrain.DriveStraightInches(0.5, 6); //Drive away to drop wings
        	Drivetrain.Stop();
        	Wings.Down();
        	Timer.delay(4); //Wat for the wings to go down
        	Drivetrain.DriveStraightInches(0.5,  -6); //Drive back to the step
        	Wings.Up();
        	Timer.delay(2); //Wait for the wings to go up
        	Drivetrain.DriveStraightInches(0.35, 136); //Drive into auto zone
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
