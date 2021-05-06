package project.EECE1610;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class WindEnergy extends Objects{

	Updater updater;
	private BufferedImage wind_image;
	
	public WindEnergy(int x, int y, ID id, Updater updater) {
		super(x, y, id);
		this.updater = updater;
		
		imageSprites ss = new imageSprites(MainMethod.wind);
		
		wind_image = ss.grabImage(1, 1, 32, 32);

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
					Header.SCORE++;
					this.xSet(0);
					this.ySet(500);
				}	
			}
		}
	}

	public void display(Graphics g) {
		g.drawImage(wind_image, x, y, null);
		
	}

	public Rectangle getBounds() {
		return new Rectangle(x,y,16,16);
	}

}
