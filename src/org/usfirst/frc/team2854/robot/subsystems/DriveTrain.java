package org.usfirst.frc.team2854.robot.subsystems;

import org.usfirst.frc.team2854.robot.RobotMap;
import org.usfirst.frc.team2854.robot.commands.DriveForward;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	CANTalon leftTalon1;
	CANTalon leftTalon2;
	CANTalon rightTalon1;
	CANTalon rightTalon2;
	
	public DriveTrain() {
		leftTalon1 = new CANTalon(RobotMap.leftMotor1);
    	leftTalon2 = new CANTalon(RobotMap.leftMotor2);
    	rightTalon1 = new CANTalon(RobotMap.rightMotor1);
    	rightTalon2 = new CANTalon(RobotMap.rightMotor2);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new DriveForward(3));
    	
    }
    public void setSpeed(double speed){
    	leftTalon1.set(speed);
    	leftTalon2.set(speed);
    	rightTalon1.set(speed);
    	rightTalon2.set(speed);
    }
    public void stop() {
    	setSpeed(0);
    	
    }
    
    
}

