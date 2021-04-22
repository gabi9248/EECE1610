package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;

public class RenewableEnergy extends Objects {

	public RenewableEnergy(int x, int y, ID id) {
		super(x, y, id);

		xvel = 0;
		yvel = 1;
		
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
		
		//Image img = Toolkit.getDefaultToolkit().createImage("/Users/Gabi/eclipse-workspace/EECE1610_Projects/EECE1610_Project/src/image/lightning.png");
		//g.drawImage(img,0,0,null);
		//figure out what an image observer is
		
		//Image img = new ImageIcon("images/lightning.png").getImage();
		//g.drawImage(img,0,0,null);
		
		g.setColor(Color.yellow);
		g.fillRect(x, y, 10, 10);
		
		
	}

}


//Image img = Toolkit.getDefaultToolkit().createImage(filename:....);

