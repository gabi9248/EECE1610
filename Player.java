package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

//object user will control
//will be the picture of an outlet
//uses Objects class to set position and speed
public class Player extends Objects{
	
	Updater updater;
	private BufferedImage player_image;

	public Player(int x, int y, ID id, Updater updater) {
		super(x, y, id);
		this.updater = updater;
		
		//accesses main method so that image can be displayed
		imageSprites ss = new imageSprites(MainMethod.outlet);
		
		//create variable that declares size of the image
		player_image = ss.grabImage(1, 1, 64, 64);
		
	}
	
	//sets bounds for collision methods to be used for other classes
	@Override
	public Rectangle getBounds() {
		return new Rectangle(x,y,32,32);
	}

	//updates position of the object relative to the declared speed
	@Override
	public void mark() {
		x += xvel;
		y += yvel;
		
		//makes sure player does not go out of the frame
		x = MainMethod.boundry(x, -10, MainMethod.WIDTH - 65);
	}

	@Override
	public void display(Graphics g) {
		
		//display set image
		g.drawImage(player_image, x, y, null);
	}

}
