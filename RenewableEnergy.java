package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class RenewableEnergy extends Objects {

	public RenewableEnergy(int x, int y, ID id) {
		super(x, y, id);

		xvel = 0;
		yvel = 1;
		
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
		g.setColor(Color.yellow);
		g.fillRect(x, y, 10, 10);
		
	}

}


//Image img = Toolkit.getDefaultToolkit().createImage(filename:....);

