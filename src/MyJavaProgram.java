import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot walle=new Robot();
	walle.sparkle();
	walle.setSpeed(50);
	walle.penDown();
	for (int i = 0; i < 4; i++) {
	walle.move(100);	
	walle.turn(90);
	}walle.penUp();
	walle.move(200);
	walle.turn(180);
	}
}
