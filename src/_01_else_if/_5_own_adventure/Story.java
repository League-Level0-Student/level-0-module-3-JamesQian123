package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Story {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "One day Bob was walking throught the city and he thought");
		String thought= JOptionPane.showInputDialog("What does he think ");
		if(thought .equalsIgnoreCase("I'm thristy")) {
			JOptionPane.showMessageDialog(null, "I'm thirsty");
		}
		else if(thought .equalsIgnoreCase("I'm hungry")) {
			JOptionPane.showMessageDialog(null, "I'm hungry");
		}
		JOptionPane.showMessageDialog(null, "Bob said to himself " + thought + " He goes to the store and sees");
		String saw = JOptionPane.showInputDialog("What does he see");
		if(saw .equalsIgnoreCase("a sandwich")) {
			JOptionPane.showMessageDialog(null, "a sandwich");
		}
		else if(saw .equalsIgnoreCase("gatorade")) {
			JOptionPane.showMessageDialog(null, "gatorade");
		
		}
		JOptionPane.showMessageDialog(null, "He sees a " + saw + " takes it and goes to the registers, he figures out that he doesn't have enough money");
		String steal = JOptionPane.showInputDialog("What should Bob do");
		if(steal .equalsIgnoreCase("steal")) {
			JOptionPane.showMessageDialog(null, "He should steal");
			JOptionPane.showMessageDialog(null, "Bob steals the " + saw + " but he gets caught and thrown into jail");
		}
		else if(steal .equalsIgnoreCase("go home")) {
			JOptionPane.showMessageDialog(null,"go home");
			JOptionPane.showMessageDialog(null, "Bob goes home and he makes a sandwich and drinks his gatorade that he already had");
		}
		

	}

}
