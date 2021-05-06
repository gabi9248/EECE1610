package project.EECE1610;

import java.awt.image.BufferedImage;

//class that allows images to be accessed in the class
public class imageSprites {

	private BufferedImage sprite;
	
	//constructor method
	public imageSprites(BufferedImage ss) {
		this.sprite = ss;
	}
	
	//specifies size of the image to be taken from the identified image
	public BufferedImage grabImage(int col, int row, int width, int height) {
		BufferedImage img = sprite.getSubimage(row*32-32, col*32-32, width, height);
		return img;
	}
	
}
