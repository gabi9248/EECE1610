package project.EECE1610;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Header {
	
	public static int HEALTH = 100;
	public static int SCORE = 0;
	
	private int level = 1;
	
	public void mark() {
		HEALTH = MainMethod.boundry(HEALTH,0,100);
	}
	
	public void display(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(15,15,200,32);
		g.setColor(Color.red);
		g.fillRect(15,15,HEALTH*2,32);
		g.setColor(Color.white);
		g.drawRect(15,15,200,32);
		
		Font fnt4 = new Font("arial", 1, 30);
		g.setFont(fnt4);
		g.setColor(Color.black);
		g.drawString("Score: " + SCORE, 500, 30);
	}

}
