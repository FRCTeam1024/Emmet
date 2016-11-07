package org.usfirst.frc1024.Emmet.commands;

import java.util.Comparator;
import java.util.Vector;

import org.usfirst.frc1024.Emmet.subsystems.Drivetrain;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.Image;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ChaseMarkAuton extends Command {
	
	public class ParticleReport implements Comparator<ParticleReport>, Comparable<ParticleReport>{
		double PercentAreaToImageArea;
		double Area;
		double BoundingRectLeft;
		double BoundingRectTop;
		double BoundingRectRight;
		double BoundingRectBottom;
		
		public int compareTo(ParticleReport r)
		{
			return (int)(r.Area - this.Area);
		}
		
		public int compare(ParticleReport r1, ParticleReport r2)
		{
			return (int)(r1.Area - r2.Area);
		}
	};
	
	Image frame;
	Image binaryFrame;
	int session;
	double VIEW_ANGLE = 0;

    public ChaseMarkAuton() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Vector<ParticleReport> particles = new Vector<ParticleReport>();
    //	NIVision.IMAQdxGrab(session, frame, 1);
    //  CameraServer.getInstance().setImage(frame);
	//	SmartDashboard.putNumber("Distance", computeDistance(binaryFrame, particles.elementAt(0)));
		if(computeDistance(binaryFrame, particles.elementAt(0)) > 4){
			Drivetrain.DriveStraightInches(0.5, 1);
	//		SmartDashboard.putString("Am I at four feet?", "Nope!");
		}else if(computeDistance(binaryFrame, particles.elementAt(0)) == 4){
			Drivetrain.Stop();
	//		SmartDashboard.putString("Am I at four feet?", "Yes!");
		}else if(computeDistance(binaryFrame, particles.elementAt(0)) < 4){
			Drivetrain.DriveStraightInches(0.5, -1);
	//		SmartDashboard.putString("Am I at four feet?", "No!");
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
    
    double computeDistance (Image image, ParticleReport report) {
		double normalizedWidth, targetWidth;
		NIVision.GetImageSizeResult size;

		size = NIVision.imaqGetImageSize(image);
		normalizedWidth = 2*(report.BoundingRectRight - report.BoundingRectLeft)/size.width;
		targetWidth = 7;

		return  targetWidth/(normalizedWidth*12*Math.tan(VIEW_ANGLE*Math.PI/(180*2)));
	}
}
