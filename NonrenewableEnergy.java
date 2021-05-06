package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

//fossil fuels - type of nonrenewable energy
//will be collected by user so that the health will go down
//uses Objects class to set position and speed
public class NonrenewableEnergy extends Objects {
	
	Updater updater;
	private BufferedImage nonrenewable_image;

	public NonrenewableEnergy(int x, int y, ID id, Updater updater) {
		super(x, y, id);
		this.updater = updater;
		
		//accesses main method so that image can be displayed
		imageSprites ss = new imageSprites(MainMethod.nonrenewable);
		
		//create variable that declares size of the image
		nonrenewable_image = ss.grabImage(1, 1, 32, 32);
		
	}
	
	//sets bounds for collision methods to be used for other classes
	@Override
	public Rectangle getBounds() {
		return new Rectangle(x,y,16,16);
	}

	//updates position of the object relative to the declared speed
	//changes position if objects collide
	@Override
	public void mark() {
		x += xvel;
		y += yvel;
		
		if(y == 0) {
			yvel = 1;
		}		
		
		collide();
	}
	
	//method that determines if there is a collision
	//makes object disappear if collision happens
	//decreases health if collision happens
	private void collide() {
		for(int i = 0;i<updater.object.size();i++) {
			Objects temp = updater.object.get(i);
			
			if(temp.idGet() == ID.Player) {
				if(getBounds().intersects(temp.getBounds())) {
					Header.HEALTH -= 10;
					this.xSet(0);
					this.ySet(500);
				}	
			}
		}
	}

	//display set image
	@Override
	public void display(Graphics g) {
		g.drawImage(nonrenewable_image, x, y, null);
		
	}

}
