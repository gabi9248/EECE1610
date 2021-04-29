package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Player extends Objects {
	
	Updater updater;

	public Player(int x, int y, ID id, Updater updater) {
		super(x, y, id);
		this.updater = updater;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x,y,16,16);
	}

	public void mark() {
		x += xvel;
		y += yvel;
		
		x = MainMethod.boundry(x, 0, MainMethod.WIDTH - 53);
		
		collision();
		changeScore();
	}
	
	private void collision() {
		for(int i = 0;i<updater.object.size();i++) {
			Objects temp = updater.object.get(i);
			
			if(temp.idGet() == ID.NonrenewableEnergy) {
				if(getBounds().intersects(temp.getBounds())) {
					//updater.clear();
					Header.HEALTH -= 1;
					
				}	
			}
		}
		}
	
	private void changeScore() {
		for(int i = 0;i<updater.object.size();i++) {
			Objects temp = updater.object.get(i);
			
			if(temp.idGet() == ID.RenewableEnergy) {
				if(getBounds().intersects(temp.getBounds())) {
					Header.SCORE++;
					updater.removeObjects(new RenewableEnergy(x,y,ID.RenewableEnergy));
				}
			}
		}
	}

	public void display(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(x, y, 32, 32);
	}

}
