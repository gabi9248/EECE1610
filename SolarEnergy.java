package project.EECE1610;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class SolarEnergy extends Objects{

	Updater updater;
	private BufferedImage solar_image;
	
	public SolarEnergy(int x, int y, ID id) {
		super(x, y, id);
		imageSprites ss = new imageSprites(MainMethod.solar);
		solar_image = ss.grabImage(1, 1, 32, 32);

	}

	public void mark() {
		x += xvel;
		y += yvel;
		
		if(y == 0) {
			yvel = 1;
		}
	}

	public void display(Graphics g) {
		g.drawImage(solar_image, x, y, null);
	}

	
	public Rectangle getBounds() {
		return new Rectangle(x,y,32,32);
	}

}