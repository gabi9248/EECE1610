package project.EECE1610;

import java.util.Random;

public class Levels {
	
	private Updater updater;
	private Header hud;
	private Random numGen = new Random();
	
	public static int level = 1;
	private int timer = 0;
	private int width = 640;
	
	public Levels(Updater updater, Header hud) {
		this.updater = updater;
		this.hud = hud;
	}
	
	public void mark() {
		
		//first level
		timer++;
		
		if(timer >= 50) {
			timer = 0;
			level++;
			
			//level 1
			if(level == 2) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/2),0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2)+width/2,0,ID.NonrenewableEnergy));
			} else if (level == 7) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/2)+width/2,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2),0,ID.NonrenewableEnergy));
			} else if (level == 12) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/2),0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2)+width/2,0,ID.NonrenewableEnergy));
			} else if (level == 17) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/2)+width/2,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2),0,ID.NonrenewableEnergy));
			} else if (level == 22) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/2),0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2)+width/2,0,ID.NonrenewableEnergy));
			} else if (level == 25) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/2)+width/2,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2),0,ID.NonrenewableEnergy));
			}
			
			// level 2
			
			else if (level == 30) {
				Header.LEVEL++;
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3),0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/3)+width/3,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.NonrenewableEnergy));
			} else if (level == 34) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/3),0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+width/3,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.NonrenewableEnergy));
			} else if (level == 38) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+width/3,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.WindEnergy));
			} else if (level == 42) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/3),0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+width/3,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.NonrenewableEnergy));
			} else if (level == 46) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/3),0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+width/3,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.NonrenewableEnergy));
			} else if (level == 50) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3),0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/3)+width/3,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.NonrenewableEnergy));
			}
			
			//level 3
			else if (level == 55) {
				Header.LEVEL++;
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4),0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/4,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/2,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.NonrenewableEnergy));
			} else if (level == 58) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4),0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4)+width/4,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/2,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.NonrenewableEnergy));
			} else if (level == 61) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/4,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4)+width/2,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.NonrenewableEnergy));
			} else if (level == 64) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/4,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/2,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.WindEnergy));
			} else if (level == 67) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4),0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4)+width/4,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/2,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.SolarEnergy));
			} else if (level == 70) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/4,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4)+width/2,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.WindEnergy));
			} else if (level == 73) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4),0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4)+width/4,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/2,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.NonrenewableEnergy));
			} else if (level == 76) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4),0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/4,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4)+width/2,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.NonrenewableEnergy));
			}
			
			//level 4
			else if (level == 81) {
				Header.LEVEL++;
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+width/5,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.SolarEnergy));
			} else if (level == 83) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5),0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.WindEnergy));
			} else if (level == 85) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5),0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+width/5,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.WindEnergy));
			} else if (level == 87) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5),0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+width/5,0,ID.WindEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.SolarEnergy));
			} else if (level == 89) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5),0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+width/5,0,ID.WindEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy));
			} else if (level == 91) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5),0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+width/5,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy));
			} else if (level == 93) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+width/5,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy));
			} else if (level == 95) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.WindEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy));
			} else if (level == 97) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.WindEnergy));
			} else if (level == 99) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5),0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy));
			} else if (level == 101) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+width/5,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy));	
			} else if (level == 103) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy));
			}  else if (level == 105) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy));
			} else if (level == 107) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.SolarEnergy));
			} 
			
			//level 5
			else if (level == 112) {
				Header.LEVEL++;
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6+5*width/6),0,ID.NonrenewableEnergy));
			} else if (level == 113) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy));
			} else if (level == 114) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy));
			} else if (level == 115) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy));
			} else if (level == 116) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy));
			} else if (level == 117) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6),0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.WindEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy));
			} else if (level == 118) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.WindEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6+5*width/6),0,ID.NonrenewableEnergy));
			} else if (level == 119) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy));
			} else if (level == 120) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy));
			} else if (level == 121) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy));
			} else if (level == 122) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6+5*width/6),0,ID.SolarEnergy));
			} else if (level == 123) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.WindEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy));
			} else if (level == 124) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6+5*width/6),0,ID.SolarEnergy));
			} else if (level == 125) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6+5*width/6),0,ID.SolarEnergy));
			} else if (level == 126) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6+5*width/6),0,ID.NonrenewableEnergy));
			} else if (level == 127) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6+5*width/6),0,ID.NonrenewableEnergy));
			} else if (level == 128) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy));
			} else if (level == 129) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6),0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6+5*width/6),0,ID.SolarEnergy));
			} else if (level == 130) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6),0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6+5*width/6),0,ID.NonrenewableEnergy));
			}
 			}
}
}

