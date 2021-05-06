package project.EECE1610;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

//solar energy - type of renewable energy
//will be collected by user so that the score goes up
//uses Objects class to set position and speed
public class SolarEnergy extends Objects{

	Updater updater;
	private BufferedImage solar_image;
	
	public SolarEnergy(int x, int y, ID id, Updater updater) {
		super(x, y, id);
		this.updater = updater;
		
		//accesses main method so that image can be displayed
		imageSprites ss = new imageSprites(MainMethod.solar);
		
		//create variable that declares size of the image
		solar_image = ss.grabImage(1, 1, 32, 32);

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
	//increases score if collision happens
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

	//display set image
	@Override
	public void display(Graphics g) {
		g.drawImage(solar_image, x, y, null);
	}

	//sets bounds for collision methods to be used for other classes
	@Override
	public Rectangle getBounds() {
		return new Rectangle(x,y,16,16);
	}

}
