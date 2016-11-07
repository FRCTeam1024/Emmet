package org.usfirst.frc1024.Emmet.commands;

import org.usfirst.frc1024.Emmet.subsystems.Wings;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class TeleopDropWings extends Command {
Boolean isDone;
    public TeleopDropWings() {
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
    		Wings.Down();
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
