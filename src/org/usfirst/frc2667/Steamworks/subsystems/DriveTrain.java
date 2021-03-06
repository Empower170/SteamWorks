// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2667.Steamworks.subsystems;

import org.usfirst.frc2667.Steamworks.RobotMap;
import org.usfirst.frc2667.Steamworks.commands.Drive;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftFront = RobotMap.driveTrainLeftFront;
    private final SpeedController leftRear = RobotMap.driveTrainLeftRear;
    private final SpeedController rightFront = RobotMap.driveTrainRightFront;
    private final SpeedController rightRear = RobotMap.driveTrainRightRear;
    private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final ADXRS450_Gyro gyro = RobotMap.gyro;

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new Drive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void mecanumDrive(Joystick joystick) {
    	mecanumDrive(joystick, 0);
    }
    
    public void mecanumDrive(Joystick joystick, double gyroAngle) {
    	robotDrive.mecanumDrive_Cartesian(joystick.getX(), joystick.getY(), joystick.getZ(), gyroAngle);
    }
    
    public void stopMotor() {
    	robotDrive.stopMotor();
    }

	public SpeedController getLeftFront() {
		return leftFront;
	}

	public SpeedController getLeftRear() {
		return leftRear;
	}

	public SpeedController getRightFront() {
		return rightFront;
	}

	public SpeedController getRightRear() {
		return rightRear;
	}
	
	public ADXRS450_Gyro getGyro() {
		return gyro;
	}
	
	public double getGyroAngle() {
		return gyro.getAngle();
	}

	public RobotDrive getRobotDrive() {
		return robotDrive;
	}
}

