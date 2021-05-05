package project.EECE1610;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Header {
	
	public static int HEALTH = 100;
	public static int SCORE = 0;
	public static int LEVEL = 1;
	
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
		
		Font fnt = new Font("serif", 1, 25);
		g.setFont(fnt);
		g.setColor(Color.black);
		g.drawString("Score: " + SCORE, 500, 40);
		
		Font fnt1 = new Font("serif", 1, 20);
		g.setFont(fnt1);
		g.drawString("Level: " + LEVEL, 515, 63);
	}

}
