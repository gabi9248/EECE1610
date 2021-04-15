package project.EECE1610;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyBoard extends KeyAdapter{
	
	private Updater updater;
	
	public KeyBoard(Updater updater) {
		this.updater = updater;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		//loop through all objects and get id
		for(int i = 0; i< updater.object.size();i++) {
			Objects temp = updater.object.get(i);
			
			if(temp.idGet() == ID.Player) {
				if(key == KeyEvent.VK_RIGHT) {
					temp.xVelSet(5);
				}
				if(key == KeyEvent.VK_LEFT) {
					temp.xVelSet(-5);
				}
			}
		}
	}
	
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		//loop through all objects and get id
		for(int i = 0; i< updater.object.size();i++) {
			Objects temp = updater.object.get(i);
			
			if(temp.idGet() == ID.Player) {
				if(key == KeyEvent.VK_RIGHT) {
					temp.xVelSet(0);
				}
				if(key == KeyEvent.VK_LEFT) {
					temp.xVelSet(0);
				}
			}
		}
	}

}
