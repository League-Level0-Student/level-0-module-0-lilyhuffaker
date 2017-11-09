import org.jointheleague.graphical.robot.Robot;

public class RobotDoesGraffiti {
public static void main(String[] args) {
	Robot walle=new Robot();
	walle.penDown();
	walle.setSpeed(50);
	walle.sparkle();
	walle.turn(180);
	walle.move(200);
	walle.turn(270);
	walle.move(150);
	walle.penUp();
	walle.move(100);
	walle.turn(180);
	walle.turn(90);
	walle.penDown();
	walle.move(100);
	walle.move(-10);
	for (int i = 0; i < 25; i++) {
		walle.turn(5);
		walle.move(5);
	}walle.penUp();
	walle.move(100);
}
}

