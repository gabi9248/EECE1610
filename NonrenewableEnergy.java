package project;

import java.awt.Color;
import java.awt.Graphics;

public class NonrenewableEnergy extends Objects {

	public NonrenewableEnergy(int x, int y, ID id) {
		super(x, y, id);
		
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
		g.fillRect(x, y, 16, 16);
		
	}

}
