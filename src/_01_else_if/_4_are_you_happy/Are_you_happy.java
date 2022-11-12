package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Are_you_happy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String happy = JOptionPane.showInputDialog("Are you happy");
		if(happy .equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
		
		}
		if(happy .equalsIgnoreCase("No")) {
			String no = JOptionPane.showInputDialog( "Do you want to be happy?");
			if(no .equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
			}
			else if(no .equalsIgnoreCase("yes")) {
				JOptionPane.showMessageDialog(null, "Change something");
			}
		}	
		}

	}


