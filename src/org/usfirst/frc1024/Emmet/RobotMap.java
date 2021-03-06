package org.usfirst.frc1024.Emmet;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static CANTalon drivetrainRightFront;
    public static CANTalon drivetrainRightRear;
    public static CANTalon drivetrainLeftFront;
    public static CANTalon drivetrainLeftRear;
    public static CANTalon drivetrainSlide1;
    public static CANTalon drivetrainSlide2;
    public static AnalogGyro drivetrainGyro;
    public static BuiltInAccelerometer accel;
    public static AnalogInput drivetrainRightUltra;
    public static AnalogInput drivetrainLeftUltra;
    public static Encoder drivetrainRightEncoder;
    public static Encoder drivetrainLeftEncoder;
    public static Encoder drivetrainSlideEncoder1;
    public static Encoder drivetrainSlideEncoder2;
    public static Solenoid drivetrainSlideActuator;
    public static CANTalon lifterLift1;
    public static CANTalon lifterLift2;
    public static DigitalInput lifterLevel0;
    public static DigitalInput lifterLevel1;
    public static DigitalInput lifterLevel2;
    public static DigitalInput lifterLevel3;
    public static DigitalInput lifterLevel4;
    public static AnalogInput lifterIR;
    public static AnalogInput lifterTIR;
   // public static Encoder lifterLiftEncoder;
    public static Compressor gripperCompressor;
    public static DoubleSolenoid gripperRightArm;
    public static DoubleSolenoid gripperLeftArm;
    public static CANTalon gripperLeftIntake;
    public static CANTalon gripperRightIntake;
    public static DigitalInput gripperBinDetector;
    public static DoubleSolenoid wingsMover;
    public static DigitalInput wingsStepButton;
    public static DoubleSolenoid wingsSpeed;

    public static void init() {
        drivetrainRightFront = new CANTalon(0);
        
        drivetrainRightRear = new CANTalon(1);
        
        drivetrainLeftFront = new CANTalon(2);
        
        drivetrainLeftRear = new CANTalon(3);
        
        drivetrainSlide1 = new CANTalon(4);
        
        drivetrainSlide2 = new CANTalon(5);
        
        drivetrainGyro = new AnalogGyro(0);
        LiveWindow.addSensor("Drivetrain", "Gyro", drivetrainGyro);
        drivetrainGyro.setSensitivity(0.007);
        drivetrainRightUltra = new AnalogInput(1);
        LiveWindow.addSensor("Drivetrain", "RightUltra", drivetrainRightUltra);
        drivetrainLeftUltra = new AnalogInput(2);
        LiveWindow.addSensor("Drivetrain", "LeftUltra", drivetrainLeftUltra);
        
        //BuiltInAccelerometer accel = new BuiltInAccelerometer();
        
        drivetrainRightEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "RightEncoder", drivetrainRightEncoder);
        drivetrainRightEncoder.setDistancePerPulse(1.0);
  
        drivetrainLeftEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "LeftEncoder", drivetrainLeftEncoder);
        drivetrainLeftEncoder.setDistancePerPulse(1.0);
        
        drivetrainSlideEncoder1 = new Encoder(4, 5, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "SlideEncoder1", drivetrainSlideEncoder1);
        drivetrainSlideEncoder1.setDistancePerPulse(1.0);
        
        drivetrainSlideEncoder2 = new Encoder(6, 7, false, EncodingType.k4X);
        LiveWindow.addSensor("Drivetrain", "SlideEncoder2", drivetrainSlideEncoder2);
        drivetrainSlideEncoder2.setDistancePerPulse(1.0);
 
        
        drivetrainSlideActuator = new Solenoid(0, 4);
        LiveWindow.addActuator("Drivetrain", "SlideActuator", drivetrainSlideActuator);
        
        lifterLift1 = new CANTalon(6);
        
        lifterLift2 = new CANTalon(7);
        
        lifterLevel0 = new DigitalInput(10);
        LiveWindow.addSensor("Lifter", "Level0", lifterLevel0);
        
        lifterLevel1 = new DigitalInput(11);
        LiveWindow.addSensor("Lifter", "Level1", lifterLevel1);
        
        lifterLevel2 = new DigitalInput(12);
        LiveWindow.addSensor("Lifter", "Level2", lifterLevel2);
        
        lifterLevel3 = new DigitalInput(13);
        LiveWindow.addSensor("Lifter", "Level3", lifterLevel3);
        
        lifterLevel4 = new DigitalInput(14);
        LiveWindow.addSensor("Lifter", "Level4", lifterLevel4);
        
        lifterIR = new AnalogInput(3);
        LiveWindow.addSensor("Lifter", "IR", lifterIR);
        
        //lifterLiftEncoder = new Encoder(8, 9, false, EncodingType.k4X);
       // LiveWindow.addSensor("Lifter", "LiftEncoder", lifterLiftEncoder);
     //   lifterLiftEncoder.setDistancePerPulse(1.0);
   //     lifterLiftEncoder.setPIDSourceParameter(PIDSourceParameter.kRate);
        gripperCompressor = new Compressor(0);
        
        
        gripperRightArm = new DoubleSolenoid(0, 0, 1);      
        LiveWindow.addActuator("Gripper", "RightArm", gripperRightArm);
        
        gripperLeftArm = new DoubleSolenoid(0, 5, 6);      
        LiveWindow.addActuator("Gripper", "LeftArm", gripperLeftArm);
        
        gripperLeftIntake = new CANTalon(8);
        
        gripperRightIntake = new CANTalon(9);
        
        gripperBinDetector = new DigitalInput(15);
        LiveWindow.addSensor("Gripper", "BinDetector", gripperBinDetector);
        
        wingsMover = new DoubleSolenoid(0, 2, 3);      
        LiveWindow.addActuator("Wings", "Mover", wingsMover);
        
        wingsSpeed = new DoubleSolenoid(0, 5, 6);
        
        wingsStepButton = new DigitalInput(9);
    }
}
