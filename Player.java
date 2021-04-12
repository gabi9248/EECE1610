package project;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends Objects {

	public Player(int x, int y, ID id) {
		super(x, y, id);
		
		
		
	}

	public void mark() {
		x += xvel;
		y += yvel;
	}

	public void display(Graphics g) {
		if(id == ID.Player) g.setColor(Color.black);
		g.fillRect(x, y, 32, 32);
	}

}
