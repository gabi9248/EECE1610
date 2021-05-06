package project.EECE1610;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Header {
	
	//create and initialize integers that will be impacted be objects
	public static int HEALTH = 100;
	public static int SCORE = 0;
	public static int LEVEL = 1;
	
	public void mark() {
		//makes sure that nothing moves out of the frame
		HEALTH = MainMethod.boundry(HEALTH,0,100);
	}
	
	public void display(Graphics g) {
		
		//create health bar
		g.setColor(Color.gray);
		g.fillRect(15,15,200,32);
		g.setColor(Color.red);
		g.fillRect(15,15,HEALTH*2,32);
		g.setColor(Color.white);
		g.drawRect(15,15,200,32);
		
		//display the score
		Font fnt = new Font("serif", 1, 25);
		g.setFont(fnt);
		g.setColor(Color.black);
		g.drawString("Score: " + SCORE, 500, 40);
		
		//display the level
		Font fnt1 = new Font("serif", 1, 20);
		g.setFont(fnt1);
		g.drawString("Level: " + LEVEL, 515, 63);
	}

}
