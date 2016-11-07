package org.usfirst.frc1024.Emmet.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1024.Emmet.Robot;
import org.usfirst.frc1024.Emmet.subsystems.Gripper;

/**
 *
 */
public class  Release extends Command {

    public Release() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.gripper);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Gripper.rightArm.set(DoubleSolenoid.Value.kReverse);
    	Gripper.leftArm.set(DoubleSolenoid.Value.kReverse);
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
