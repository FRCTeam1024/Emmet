

package org.usfirst.frc1024.Emmet;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.livewindow.LiveWindowSendable;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public Joystick logi;
    public Joystick xBox;
	public static LiveWindowSendable xBoxA;
    public Joystick lJoy;
    public Joystick rJoy;
    
    public JoystickButton UpActuator;
    public JoystickButton DownActuator;
    
    /**Declaring buttons as common names so we don't have to use numbers**/
    
    /**
     * xBox Joystick Declarations
     **/
    //public JoystickButton xBoxA;
    public JoystickButton xBoxB;
    public JoystickButton xBoxX;
    public JoystickButton xBoxY;
    public JoystickButton xBoxLBumper;
    public JoystickButton xBoxRBumper;
    public JoystickButton xBoxLStickPress;
    public JoystickButton xBoxRStickPress;
    /**
     * Logitech Joystick Declarations
     **/
    public JoystickButton logiA;
    public JoystickButton logiB;
    public JoystickButton logiX;
    public JoystickButton logiY;
    public JoystickButton logiLBumper;
    public JoystickButton logiRBumper;
    public JoystickButton logiLStickPress; 
    public JoystickButton logiRStickPress;
	public OI() {
        logi = new Joystick(0);
        xBox = new Joystick(1);
        lJoy = new Joystick(2);
        rJoy = new Joystick(3);
        UpActuator = new JoystickButton(logi, 5);
        DownActuator = new JoystickButton(logi, 7);
        
        /**
         * Declaring buttons as common names instead of numbers
        **/
        //xBoxA = new JoystickButton(xBox, 1);
        xBoxB = new JoystickButton(xBox, 2);
        xBoxX = new JoystickButton(xBox, 3);
        xBoxY = new JoystickButton(xBox, 4);
        xBoxLBumper = new JoystickButton(xBox, 5);
        xBoxRBumper = new JoystickButton(xBox, 6);
        xBoxLStickPress = new JoystickButton(xBox, 9);
        xBoxRStickPress = new JoystickButton(xBox, 10);
        
        //Button numbers are not final
        logiA = new JoystickButton(logi, 1);
        logiB = new JoystickButton(logi, 2);
        logiX = new JoystickButton(logi, 3);
        logiY = new JoystickButton(logi, 4);
        logiLBumper = new JoystickButton(logi, 5);
        logiRBumper = new JoystickButton(logi, 6);
        logiLStickPress = new JoystickButton(logi, 9);
        logiRStickPress = new JoystickButton(logi, 10);
        
        //UpActuator.whenPressed(new ActuateUp());
        //DownActuator.whenPressed(new ActuateDown());
    }
}

