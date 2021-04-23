package project.EECE1610;

import java.util.Random;

public class Levels {
	
	private Updater updater;
	private Header hud;
	private Random numGen = new Random();
	private int level = 1;
	
	private int timer = 0;
	
	public Levels(Updater updater, Header hud) {
		this.updater = updater;
		this.hud = hud;
	}
	
	public void mark() {
		timer++;
		
		if(timer >= 100) {
			timer = 0;
			level++;
			
			if(level == 2) {
				updater.addObjects(new RenewableEnergy(numGen.nextInt(MainMethod.WIDTH),0,ID.RenewableEnergy));
			} else if (level == 3) {
				updater.addObjects(new RenewableEnergy(numGen.nextInt(MainMethod.WIDTH),0,ID.RenewableEnergy));
			}
		} 
	}

}
