package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class NonrenewableEnergy extends Objects {
	
	private BufferedImage nonrenewable_image;

	public NonrenewableEnergy(int x, int y, ID id) {
		super(x, y, id);
		
		imageSprites ss = new imageSprites(MainMethod.spriteSheet);
		
		nonrenewable_image = ss.grabImage(1, 1, 45, 15);
		
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
		
		g.drawImage(nonrenewable_image, x, y, null);
		
		//g.setColor(Color.black);
		//g.fillRect(x, y, 10, 10);
		
	}

}
