package project.EECE1610;

import java.awt.image.BufferedImage;

public class imageSprites {

	private BufferedImage sprite;
	
	public imageSprites(BufferedImage ss) {
		this.sprite = ss;
	}
	
	public BufferedImage grabImage(int col, int row, int width, int height) {
		BufferedImage img = sprite.getSubimage(row*32-32, col*32-32, width, height);
		return img;
	}
	
}
