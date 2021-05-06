package project.EECE1610;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

//class loads images into the game usign a method
public class BufferImageLoader {
	
	BufferedImage image;
	
	public BufferedImage loadImage(String path) {
		try {
			image = ImageIO.read(getClass().getResource(path));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return image;
	}

}
