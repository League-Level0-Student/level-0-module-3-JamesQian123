
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;


public class RobotColorChooser {
	public static void main(String[] args) {

		//1. Create a new Robot
		Robot rob = new Robot();
		rob.setWindowSize(1000, 1000);
		rob.setSpeed(100);
		//2. Make the robot draw a shape (this will take more than one line of code)

		int i = 0;
		Random ran = new Random();


		//3. Set the pen width to 10

		//4. Ask the user what color pen they would like the robot to draw with
		
		//5. Use an if/else statement to set the pen color that the user requested
		while(i<1000000000) {
			String color = JOptionPane.showInputDialog("What color do you want to be drawn with");
			if(color.equalsIgnoreCase("red")) {
				rob.setPenColor(252, 25, 25);
			}
			else if(color.equalsIgnoreCase("blue")) {
				rob.setPenColor(25,124,252);
			}
			else if(color.equalsIgnoreCase("green")) {
				rob.setPenColor(25, 252, 56);
			}
			else if(color.equalsIgnoreCase("yellow")) {
				rob.setPenColor(252, 234, 25);
			}
			else if(color.equalsIgnoreCase("orange")) {
				rob.setPenColor(252,150,25);
			}
			else if(color.equalsIgnoreCase("purple")) {
				rob.setPenColor(121,25,252);
			}
			//6. If the user doesn't enter anything, choose a random color
			else {
				rob.setRandomPenColor();
			}
			//7. Put a loop around your code so that you keep asking the user for more colors & drawing them
			rob.setPenWidth(10);
			int  j = 0;
			
			while(j<4) {

				rob.penDown();
				rob.move(100);
				rob.turn(90);
				
				j +=1;
			}
			rob.setX(ran.nextInt(1000));
			rob.setY(ran.nextInt(1000));
			i+=1;
		}
	}
}
