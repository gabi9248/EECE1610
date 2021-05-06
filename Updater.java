package project.EECE1610;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;

//updates all objects
//will loop through all of the objects in the game and render to the screen

public class Updater {

	//do not know how many objects there will be
	LinkedList<Objects> object = new LinkedList<Objects>();
	
	public void mark() {
		//will loop through all of the objects
		for(int i =0;i<object.size();i++) {
			//obtain id of the objects
			Objects temp = object.get(i);
			//update the temporary object
			temp.mark();
		}
			
	}
	public void display(Graphics g) {
		//will loop through all of the objects
		for(int i =0;i<object.size();i++) {
			//obtain id of the objects
			Objects temp = object.get(i);
			//update the temporary object
			temp.display(g);
		}
	}	
	
	//clears the objects from the screen
	public void clear() {
		for(int i=0;i<object.size();i++) {
			Objects temp = object.get(i); 
			
			if(temp.idGet() == ID.Player) {
				//use LinkedList method to clear objects from the screen
				//method removes objects from the list
				object.clear();
				if(MainMethod.gameState != MainMethod.FRAME.End)
				addObjects(new Player((int)temp.xGet(), (int)temp.yGet(),ID.Player,this));
			}
			
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
