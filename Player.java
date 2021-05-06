package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class Player extends Objects{
	
	Updater updater;
	private BufferedImage player_image;

	public Player(int x, int y, ID id, Updater updater) {
		super(x, y, id);
		this.updater = updater;
		
		imageSprites ss = new imageSprites(MainMethod.outlet);
		player_image = ss.grabImage(1, 1, 64, 64);
		
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,32,32);
	}

	public void mark() {
		x += xvel;
		y += yvel;
		
		x = MainMethod.boundry(x, -10, MainMethod.WIDTH - 65);
	}

	public void display(Graphics g) {
		
		g.drawImage(player_image, x, y, null);
		
		//g.setColor(Color.green);
		//g.fillRect(x, y, 32, 32);
	}

}
