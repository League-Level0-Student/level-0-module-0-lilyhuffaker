import javax.swing.JOptionPane;

public class WhatYoouSayIsAwsome {
public static void main(String[] args) {
String name=JOptionPane.showInputDialog("What is your name?");
JOptionPane.showMessageDialog(null, name+",thats a cool name");
String numbr=JOptionPane.showInputDialog("what is your social security number?");
JOptionPane.showMessageDialog(null, numbr+", meh not a big fan");
JOptionPane.showMessageDialog(null, "-hogwarts theme song starts playing in the backround-");


}
}
