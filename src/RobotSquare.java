/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot

Robot nugget=new Robot();

        // 3. Put the robot's pen down
nugget.penDown();

        // 6. Make the robot move as fast as possible
nugget.setSpeed(99);

        // 5. Do everything below here 4 times
for (int i = 0; i < 4; i++) {
	nugget.move(200);
	nugget.turn(90);
}
nugget.turn(180);
nugget.penDown();
for (int i = 0; i < 3; i++) {
nugget.move(150);
nugget.turn(360/3);
}
        //         2. Move your robot 200 pixels


        //         4. Turn the robot 90 degrees to the right (90 degrees)


    }
}
