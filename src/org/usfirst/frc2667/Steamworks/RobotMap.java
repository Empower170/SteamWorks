// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2667.Steamworks;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftFront;
    public static SpeedController driveTrainLeftRear;
    public static SpeedController driveTrainRightFront;
    public static SpeedController driveTrainRightRear;
    public static RobotDrive driveTrainRobotDrive;
    public static CANTalon shootershooterTalon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftFront = new Victor(0);
        LiveWindow.addActuator("DriveTrain", "LeftFront", (Victor) driveTrainLeftFront);
        
        driveTrainLeftRear = new Victor(1);
        LiveWindow.addActuator("DriveTrain", "LeftRear", (Victor) driveTrainLeftRear);
        
        driveTrainRightFront = new Victor(2);
        LiveWindow.addActuator("DriveTrain", "RightFront", (Victor) driveTrainRightFront);
        
        driveTrainRightRear = new Victor(3);
        LiveWindow.addActuator("DriveTrain", "RightRear", (Victor) driveTrainRightRear);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainLeftFront, driveTrainLeftRear,
              driveTrainRightFront, driveTrainRightRear);
        
        driveTrainRobotDrive.setSafetyEnabled(false);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(1.0);
        driveTrainRobotDrive.setMaxOutput(1.0);

        shootershooterTalon = new CANTalon(0);
        LiveWindow.addActuator("Shooter", "shooterTalon", shootershooterTalon);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
