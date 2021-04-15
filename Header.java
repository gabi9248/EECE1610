package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;

public class Header {
	
	public static int HEALTH = 100;
	
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
	}

}
