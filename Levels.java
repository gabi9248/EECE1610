package project.EECE1610;

import java.util.Random;

//class that create different levels
public class Levels {
	
	private Updater updater;
	private Header hud;
	private Random numGen = new Random();
	
	//declares and initializes integers
	public static int level = 1;
	private int timer = 0;
	private int width = 640;
	
	public Levels(Updater updater, Header hud) {
		this.updater = updater;
		this.hud = hud;
	}
	
	public void mark() {

		//increments by one
		timer++;
		
		//if timer reaches a specific value, then the timer resets and the level is incremented
		if(timer >= 50) {
			timer = 0;
			level++;
			
			//adds objects as levels are incremented
			//level 1
			if(level == 2) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/2),0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2)+width/2,0,ID.NonrenewableEnergy,updater));
			} else if (level == 7) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/2)+width/2,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2),0,ID.NonrenewableEnergy,updater));
			} else if (level == 12) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/2),0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2)+width/2,0,ID.NonrenewableEnergy,updater));
			} else if (level == 17) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/2)+width/2,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2),0,ID.NonrenewableEnergy,updater));
			} else if (level == 22) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/2),0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2)+width/2,0,ID.NonrenewableEnergy,updater));
			} else if (level == 27) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/2)+width/2,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/2),0,ID.NonrenewableEnergy,updater));
			} else if (level == 39) {
				updater.clear();
			}
			
			// level 2
			
			else if (level == 40) {
				Header.LEVEL++;
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/3)+width/3,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.NonrenewableEnergy,updater));
			} else if (level == 44) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/3),0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+width/3,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.NonrenewableEnergy,updater));
			} else if (level == 48) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+width/3,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.WindEnergy,updater));
			} else if (level == 52) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/3),0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+width/3,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.NonrenewableEnergy,updater));
			} else if (level == 56) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/3),0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+width/3,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.NonrenewableEnergy,updater));
			} else if (level == 60) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/3)+width/3,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/3)+2*width/3,0,ID.NonrenewableEnergy,updater));
			} else if (level == 69) {
				updater.clear();
			}
			
			//level 3
			else if (level == 70) {
				Header.LEVEL++;
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4),0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/4,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/2,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.NonrenewableEnergy,updater));
			} else if (level == 73) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4)+width/4,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/2,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.NonrenewableEnergy,updater));
			} else if (level == 76) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/4,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4)+width/2,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.NonrenewableEnergy,updater));
			} else if (level == 79) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/4,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/2,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.WindEnergy,updater));
			} else if (level == 82) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4)+width/4,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/2,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.SolarEnergy,updater));
			} else if (level == 85) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/4,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4)+width/2,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.WindEnergy,updater));
			} else if (level == 88) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4),0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4)+width/4,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/2,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.NonrenewableEnergy,updater));
			} else if (level == 91) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/4),0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+width/4,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/4)+width/2,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/4)+3*width/4,0,ID.NonrenewableEnergy,updater));
			} else if (level == 105) {
				updater.clear();
			}
			
			//level 4
			else if (level == 106) {
				Header.LEVEL++;
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.SolarEnergy,updater));
			} else if (level == 108) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5),0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.WindEnergy,updater));
			} else if (level == 110) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5),0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+width/5,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.WindEnergy,updater));
			} else if (level == 112) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5),0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+width/5,0,ID.WindEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.SolarEnergy,updater));
			} else if (level == 114) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5),0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+width/5,0,ID.WindEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy,updater));
			} else if (level == 116) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5),0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+width/5,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy,updater));
			} else if (level == 118) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy,updater));
			} else if (level == 120) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.WindEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy,updater));
			} else if (level == 122) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.WindEnergy,updater));
			} else if (level == 124) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5),0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy,updater));
			} else if (level == 126) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+width/5,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy,updater));	
			} else if (level == 128) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy,updater));
			}  else if (level == 130) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.NonrenewableEnergy,updater));
			} else if (level == 132) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+2*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/5)+3*width/5,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/5)+4*width/5,0,ID.SolarEnergy,updater));
			} else if (level == 142) {
				updater.clear();
			}
			
			//level 5
			else if (level == 143) {
				Header.LEVEL++;
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6+5*width/6),0,ID.NonrenewableEnergy,updater));
			} else if (level == 144) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy,updater));
			} else if (level == 145) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy,updater));
			} else if (level == 146) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy,updater));
			} else if (level == 147) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy,updater));
			} else if (level == 148) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy,updater));
			} else if (level == 149) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6+5*width/6),0,ID.NonrenewableEnergy,updater));
			} else if (level == 150) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy,updater));
			} else if (level == 151) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy,updater));
			} else if (level == 152) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy,updater));
			} else if (level == 153) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6+5*width/6),0,ID.SolarEnergy,updater));
			} else if (level == 154) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy,updater));
			} else if (level == 155) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6+5*width/6),0,ID.SolarEnergy,updater));
			} else if (level == 156) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6+5*width/6),0,ID.SolarEnergy,updater));
			} else if (level == 157) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6+5*width/6),0,ID.NonrenewableEnergy,updater));
			} else if (level == 158) {
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6),0,ID.WindEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6+5*width/6),0,ID.NonrenewableEnergy,updater));
			} else if (level == 159) {
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6),0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6+5*width/6),0,ID.WindEnergy,updater));
			} else if (level == 160) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new WindEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.WindEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6+5*width/6),0,ID.SolarEnergy,updater));
			} else if (level == 161) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6),0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+2*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new SolarEnergy(numGen.nextInt(width/6)+3*width/6,0,ID.SolarEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6)+4*width/6,0,ID.NonrenewableEnergy,updater));
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(width/6+5*width/6),0,ID.NonrenewableEnergy,updater));
			} else if (level == 170) {
				updater.clear();
			}
 			}
}
}

