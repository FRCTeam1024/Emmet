package org.usfirst.frc1024.Emmet.subsystems;

import org.usfirst.frc1024.Emmet.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Wings extends Subsystem {
	public static DoubleSolenoid Mover = RobotMap.wingsMover;
	public static DigitalInput stepButton = RobotMap.wingsStepButton;
	public static DoubleSolenoid speed = RobotMap.wingsSpeed;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public static void Down(){
    	Mover.set(DoubleSolenoid.Value.kReverse);
    }
    public static void Up(){
    	Mover.set(DoubleSolenoid.Value.kForward);
    }
    public static void SetFast(){
    	speed.set(DoubleSolenoid.Value.kReverse);
    }
    public static void SetSlow(){
    	speed.set(DoubleSolenoid.Value.kForward);
    }
}

