package project.EECE1610;

import java.awt.Graphics;
import java.util.LinkedList;

//updates all objects
//will loop through all of the objects in the game and render to the screen

public class Updater {

	//do not know how many objects there will be
	LinkedList<Objects> object = new LinkedList<Objects>();
	
	public void mark() {
		for(int i =0;i<object.size();i++) {
			//will loop through all of the objects
			Objects temp = object.get(i); //allows to get id of objects
			temp.mark();
		}
			
	}
	public void display(Graphics g) {
		for(int i =0;i<object.size();i++) {
			Objects temp = object.get(i);
			temp.display(g);
		}
	}	
	
	//add objects to the list in the Updater class
	public void addObjects(Objects object) {
		this.object.add(object);
	}
	
	//remove objects from the list in the Updater class
	public void removeObjects(Objects object) {
		this.object.remove(object);
	}
	
}
