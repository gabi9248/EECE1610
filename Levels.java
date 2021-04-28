package project.EECE1610;

import java.util.Random;

public class Levels {
	
	private Updater updater;
	private Header hud;
	private Random numGen = new Random();
	
	public static int level1 = 1;
	private int level2 = 1;
	
	private int timerLevel1 = 0;
	private int timerLevel2 = 0;
	
	public Levels(Updater updater, Header hud) {
		this.updater = updater;
		this.hud = hud;
	}
	
	public void mark() {
		
		//first level
		timerLevel1++;
		
		if(timerLevel1 >= 100) {
			timerLevel1 = 0;
			level1++;
			
			if(level1 == 2) {
				updater.addObjects(new RenewableEnergy(0,0,ID.RenewableEnergy));
			} else if (level1 == 3) {
				updater.addObjects(new RenewableEnergy(100,0,ID.RenewableEnergy));
			} else if (level1 == 4) {
				updater.addObjects(new RenewableEnergy(200,0,ID.RenewableEnergy));
			} else if (level1 == 5) {
				updater.addObjects(new RenewableEnergy(300,0,ID.RenewableEnergy));
			} else if (level1 == 6) {
				updater.addObjects(new RenewableEnergy(400,0,ID.RenewableEnergy));
			} else if (level1 == 7) {
				updater.addObjects(new RenewableEnergy(500,0,ID.RenewableEnergy));
			} else if (level1 == 8) {
				updater.addObjects(new RenewableEnergy(600,0,ID.RenewableEnergy));
			}
			
			if(level1 == 9) {
				updater.addObjects(new NonrenewableEnergy(600,0,ID.NonrenewableEnergy));
			} else if (level1 == 10) {
				updater.addObjects(new NonrenewableEnergy(500,0,ID.NonrenewableEnergy));
			} else if (level1 == 11) {
				updater.addObjects(new NonrenewableEnergy(400,0,ID.NonrenewableEnergy));
			} else if (level1 == 12) {
				updater.addObjects(new NonrenewableEnergy(300,0,ID.NonrenewableEnergy));
			} else if (level1 == 13) {
				updater.addObjects(new NonrenewableEnergy(200,0,ID.NonrenewableEnergy));
			} else if (level1 == 14) {
				updater.addObjects(new NonrenewableEnergy(100,0,ID.NonrenewableEnergy));
			} else if (level1 == 15) {
				updater.addObjects(new NonrenewableEnergy(0,0,ID.NonrenewableEnergy));
			}	
		} 
		
		if (level1 == 15) {
			timerLevel2++;
		}
		
		if(timerLevel2 >= 100) {
			timerLevel2 = 0;
			level2++;
		}
		
		if (level2 == 2) {
			updater.addObjects(new RenewableEnergy(0,0,ID.RenewableEnergy));
		} else if (level2 == 3) {
			updater.addObjects(new RenewableEnergy(10,0,ID.RenewableEnergy));
		}
	}

}
