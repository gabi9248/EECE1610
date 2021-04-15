package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class NonrenewableEnergy extends Objects {

	public NonrenewableEnergy(int x, int y, ID id) {
		super(x, y, id);
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,10,10);
	}

	public void mark() {
		x += xvel;
		y += yvel;
		
		if(y == 0) {
			yvel = 1;
		}		
	}

	public void display(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(x, y, 10, 10);
		
	}

}
