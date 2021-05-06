package project.EECE1610;

import java.awt.Graphics;
import java.awt.Rectangle;

//holds all of the different parts of the game
//super class that can be extended and used throughout the game

public abstract class Objects {

	//because variables are protected, they can only be accessed by which object inherits the game object
	//overlaps into the player objects
	protected int x; 
	protected int y;
	
	protected ID id;
	protected int xvel;
	protected int yvel;
	
	//constructor method
	public Objects(int x, int y, ID id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	//going to use within different classes
	public abstract void mark(); 
	public abstract void display(Graphics g);
	public abstract Rectangle getBounds();
	
	//create access methods
	public void xSet(int x) {
		this.x = x;
	}	
	public int xGet() {
		return x;
	}	
	public void ySet(int y) {
		this.y = y;
	}	
	public int yGet() {
		return y;
	}	
	public void idSet(ID id) {
		this.id = id;
	}	
	public ID idGet() {
		return id;
	}
	public void xVelSet(int xvel) {
		this.xvel = xvel;
	}
	public int xVelGet() {
		return xvel;
	}
	public void yVelSet(int yvel) {
		this.yvel = yvel;
	}	
	public int yVelGet() {
		return yvel;
	}
	
}
