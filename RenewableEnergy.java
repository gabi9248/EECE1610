package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;

public class RenewableEnergy extends Objects{

	Updater updater;
	private BufferedImage renewable_image;
	
	public RenewableEnergy(int x, int y, ID id) {
		super(x, y, id);

		xvel = 0;
		yvel = 1;
		
		imageSprites ss = new imageSprites(MainMethod.spriteSheet2);
		
		renewable_image = ss.grabImage(1, 1, 15, 15);
		
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

		g.drawImage(renewable_image, x, y, null);
		
		//g.setColor(Color.yellow);
		//g.fillRect(x, y, 10, 10);
		
		
	}

}


//Image img = Toolkit.getDefaultToolkit().createImage(filename:....);

