/*package project;

import java.awt.Color; //importing stuff
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class GameOver
{
	public void display(Graphics g)
	{
		if(HEALTH==0) //Checks if the HEALTH bar is equal to 0, when it is it writes out Game Over
		{
			removeObjects; //Removing the objects
			
			JFrame frame = new JFrame(); //Changing the background color to red
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      frame.setPreferredSize(new Dimension(550, 300));
		      frame.getContentPane().setBackground(Color.BLACK);
		      frame.pack();
		      frame.setVisible(true);
			
			
			Font fnt = new Font("arial", 1, 40); //Setting the font to arial
		
			g.setFont(fnt); //Getting the font
			g.setColor(Color.red); //Setting the color to black
			g.drawString("Game Over", 270, 90); //Saying game over
		}
	}
}
*/
