package org.usfirst.frc1024.Emmet.commands;

import org.usfirst.frc1024.Emmet.RobotMap;
import org.usfirst.frc1024.Emmet.subsystems.Drivetrain;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */

public class driveStraight extends Command{
	boolean isDone;
    public driveStraight(){
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize(){
    	isDone = false;
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute(){
    	if(isDone == false){
    	
    		
    	
    	RobotMap.drivetrainGyro.initGyro();
    	RobotMap.drivetrainGyro.reset();
		RobotMap.drivetrainLeftEncoder.reset();
		RobotMap.drivetrainLeftFront.enableBrakeMode(true);
    	RobotMap.drivetrainLeftRear.enableBrakeMode(true);
    	RobotMap.drivetrainRightFront.enableBrakeMode(true);
    	RobotMap.drivetrainRightRear.enableBrakeMode(true);
    	
    	//double accelX = RobotMap.accel.getX();
    	//SmartDashboard.putNumber("AccelX", accelX);
    	
    	//double inches = RobotMap.drivetrainLeftEncoder.getDistance()/(360/(13.2));
       /* while(RobotMap.drivetrainLeftEncoder.getDistance() < (distance*(360/(4.1*Math.PI)))){
        	SmartDashboard.putNumber("Encoder Thingy", RobotMap.drivetrainLeftEncoder.getDistance());
        	//SmartDashboard.putNumber("Encoder Inches", inches);
        	double current = RobotMap.drivetrainGyro.getAngle() /** gyroConstant;
        	if(current > 0){
        		Drivetrain.DriveMotors(-0.2, -0.25, 0);
       		}else if(current < 0){
       			Drivetrain.DriveMotors(-0.25, -0.2, 0);
       		}else{
       			Drivetrain.DriveMotors(-0.2, -0.2, 0);
       		}
        	isDone = true;
        }
        Drivetrain.DriveMotors(0,0,0);*/
    	while (RobotMap.drivetrainGyro.getAngle()*1.05 > -90) {
    		Drivetrain.DriveMotors(0.25, -0.25, 0);
    	} 
    	Drivetrain.DriveMotors(0, 0, 0);
        isDone = true;
    }
    }
    

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished(){
        return false;
    }

    // Called once after isFinished returns true
    protected void end(){
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted(){
    }
}
