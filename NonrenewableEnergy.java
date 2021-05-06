package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class NonrenewableEnergy extends Objects {
	
	Updater updater;
	private BufferedImage nonrenewable_image;

	public NonrenewableEnergy(int x, int y, ID id, Updater updater) {
		super(x, y, id);
		this.updater = updater;
		imageSprites ss = new imageSprites(MainMethod.nonrenewable);
		
		nonrenewable_image = ss.grabImage(1, 1, 32, 32);
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,16,16);
	}

	public void mark() {
		x += xvel;
		y += yvel;
		
		if(y == 0) {
			yvel = 1;
		}		
		
		collide();
	}
	
	private void collide() {
		for(int i = 0;i<updater.object.size();i++) {
			Objects temp = updater.object.get(i);
			
			if(temp.idGet() == ID.Player) {
				if(getBounds().intersects(temp.getBounds())) {
					Header.HEALTH--;
					this.xSet(0);
					this.ySet(500);
				}	
			}
		}
	}

	public void display(Graphics g) {
		
		g.drawImage(nonrenewable_image, x, y, null);
		
		//g.setColor(Color.black);
		//g.fillRect(x, y, 10, 10);
		
	}

}
