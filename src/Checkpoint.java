import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint {
public static void main(String[] args) {
String color=JOptionPane.showInputDialog("Whats your favorite color?");
JOptionPane.showMessageDialog(null, "my favorite color is "+color+" Too!");
Robot walle=new Robot();
walle.penDown();
walle.setPenColor(Color.YELLOW);
walle.turn(45);
walle.move(100);
walle.turn(45);
walle.move(100);
walle.turn(45);
walle.move(100);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
