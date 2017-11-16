import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String name=JOptionPane.showInputDialog("Please enter name");
JOptionPane.showMessageDialog(null, name+" has joined the chat");
JOptionPane.showMessageDialog(null, "Dr Nugget has joined the chat");
JOptionPane.showMessageDialog(null, "Dr Nugget: Hello "+name);
String response=JOptionPane.showInputDialog("Enter words here:");
JOptionPane.showConfirmDialog(null, name+": "+response);
	
	
	
	
	
}
}
