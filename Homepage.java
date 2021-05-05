package project.EECE1610;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import project.EECE1610.MainMethod.FRAME;

public class Homepage extends MouseAdapter{
	
	private MainMethod game;
	private Updater updater;
	private Random numGen;
	private Header hud;
	
	public Homepage(MainMethod game, Updater updater, Header hud) {
		this.game = game;
		this.updater = updater;
		this.hud = hud;
	}
	
	public void mousePressed(MouseEvent e) {
		int tempx = e.getX();
		int tempy = e.getY();
		
		numGen = new Random();
		
		if(MainMethod.gameState == FRAME.Homepage) {
			if(mouseOver(tempx, tempy, 0, 0, 640, 640/12*9)) {
				game.gameState = FRAME.Instructions;
			/*
			for(int i=0; i<10;i++){
				updater.addObjects(new RenewableEnergy(numGen.nextInt(MainMethod.WIDTH),0,ID.RenewableEnergy));
				}
			
			for(int j=0; j<10 ; j++) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(MainMethod.WIDTH),0,ID.NonrenewableEnergy));
			}
			*/
		}
		}
		
		if(MainMethod.gameState == FRAME.Instructions) {
			if(mouseOver(tempx, tempy, 212, 175, 200, 40)) {
				game.gameState = FRAME.Play;
				updater.addObjects(new Player(290,385,ID.Player,updater));
			}
		}
		
		if(MainMethod.gameState == FRAME.End) {
			if(mouseOver(tempx,tempy,303, 166, 60, 20)) {
				MainMethod.gameState = FRAME.Play;
				updater.addObjects(new Player(290,385,ID.Player,updater));
				updater.clear();
				Header.HEALTH = 100;
				Header.LEVEL = 1;
				Header.SCORE = 0;
			}
		}
	}
	
	public void mouseReleased(MouseEvent e) {
		
	}

	private boolean mouseOver(int tempx, int tempy, int x, int y, int width, int height) {
		if(tempx > x && tempx < x + width) {
			if(tempy > y && tempy < y + height) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	public void mark() {
		
	}
	
	public void display(Graphics g) {
		
		//homepage
		if (MainMethod.gameState == FRAME.Homepage) {
			Font fnt = new Font("serif", 1, 40);
			Font fnt2 = new Font("serif", 1, 30);
			
			g.setFont(fnt);
			g.setColor(Color.black);
			g.drawString("Welcome to Energy Collector!", 50, 70);
		
			g.setFont(fnt2);
			g.setColor(Color.black);
			g.drawString("~ Click Anywhere Start ~", 150, 110);
			
			g.setColor(Color.DARK_GRAY);
			g.fill3DRect(0, 300, 100, 200, false);
			g.fill3DRect(105, 250, 100, 300, false);
			g.fill3DRect(210, 320, 100, 130, false);
			g.fill3DRect(315, 300, 100, 250, false);
			g.fill3DRect(420, 220, 100, 400, false);
			g.fill3DRect(525, 240, 100, 400, false);
			
			g.setColor(Color.WHITE);
			
			for(int i = 306; i<500; i+=20) {
				for(int j = 5; j < 100; j+=20) {
				g.setColor(Color.YELLOW);
				g.fillRect(j, i, 10, 10);
				}
			}
			
			for(int i = 425; i<525; i+=20) {
				g.fillRect(i, 225, 7, 212);
			}
			
			for(int i = 325; i<500; i+=20) {
				for(int j = 215; j < 300; j+=33) {
				g.fillRect(j, i, 10, 15);
				g.fillRect(j+15, i, 10, 15);
				}
			}
			
			for(int i = 112;i<200;i+=20) {
				for(int j = 255; j<500;j+=50) {
				g.fillRect(i, j, 5, 30);
				}
			}
			
			for(int i = 320;i<400;i+=20) {
				for(int j = 310; j<500;j+=15) {
				g.fillRect(i, j, 30, 2);
				}
			}
			
			for(int i = 530;i<625;i+=10) {
				for(int j = 245;j<500;j += 15) {
					g.fillRect(i, j, 4, 2);	
				}
			}
		
		//instructions page
		} else if (MainMethod.gameState == FRAME.Instructions) {
				Font fnt = new Font("serif", 1, 20);
				Font fnt1 = new Font("serif", 1, 15);
				Font fnt2 = new Font("serif", 1, 15);
				
				g.setFont(fnt);
				g.setColor(Color.black);
				g.drawString("Light up your city by collecting as much", 140, 70);
				g.drawString("renewable energy as you can!", 190, 100);
				g.drawString("Be sure to avoid nonrenewable energy", 140, 130);
				g.drawString("so that your health does not go down!", 150,160);
				
				g.setFont(fnt1);
				g.drawString("Press here to continue", 240, 200);
				
				g.setColor(Color.LIGHT_GRAY);
				g.drawRect(212, 175, 200, 40);
				
				g.setColor(Color.DARK_GRAY);
				g.fill3DRect(0, 300, 100, 200, false);
				g.fill3DRect(105, 250, 100, 300, false);
				g.fill3DRect(210, 320, 100, 130, false);
				g.fill3DRect(315, 300, 100, 250, false);
				g.fill3DRect(420, 220, 100, 400, false);
				g.fill3DRect(525, 240, 100, 400, false);
				
				for(int i = 306; i<500; i+=20) {
					for(int j = 5; j < 100; j+=20) {
					g.setColor(Color.YELLOW);
					g.fillRect(j, i, 10, 10);
					}
				}
				
				for(int i = 425; i<525; i+=20) {
					g.fillRect(i, 225, 7, 212);
				}
				
				for(int i = 325; i<500; i+=20) {
					for(int j = 215; j < 300; j+=33) {
					g.fillRect(j, i, 10, 15);
					g.fillRect(j+15, i, 10, 15);
					}
				}
				
				for(int i = 112;i<200;i+=20) {
					for(int j = 255; j<500;j+=50) {
					g.fillRect(i, j, 5, 30);
					}
				}
				
				for(int i = 320;i<400;i+=20) {
					for(int j = 310; j<500;j+=15) {
					g.fillRect(i, j, 30, 2);
					}
				}
				
				for(int i = 530;i<625;i+=10) {
					for(int j = 245;j<500;j += 15) {
						g.fillRect(i, j, 4, 2);	
					}
				}
				
		//game over page 
		} else if (MainMethod.gameState == FRAME.End) {
				Font fnt = new Font("serif", 1, 40);
				Font fnt2 = new Font("serif", 1, 30);
				Font fnt3 = new Font("serif", 1, 20);
				Font fnt4 = new Font("serif", 1, 10);
				
				g.setFont(fnt);
				g.setColor(Color.black);
				g.drawString("Game Over", 235, 70);
			
				g.setFont(fnt2);
				g.drawString("Score: " + Header.SCORE, 270, 110);
				
				g.setFont(fnt3);
				if (Header.SCORE >= 0 && Header.SCORE <= 200) {
					g.drawString("Barely lit up your city", 240, 142);
				} else if (Header.SCORE >= 200 && Header.SCORE <= 500) {
					g.drawString("Good job! Keep going!", 240, 142);
				} else if (Header.SCORE >= 500 && Header.SCORE <= 1000) {
					g.drawString("Yay", 240, 142);
				} else {
					g.drawString("Congradulations! You lit up your city!!", 240, 142);
				}
				
				g.setFont(fnt4);
				g.drawRect(303, 166, 60, 20);
				g.drawString("Try Again",311 ,180);
				
				g.setColor(Color.DARK_GRAY);
				g.fill3DRect(0, 300, 100, 200, false);
				g.fill3DRect(105, 250, 100, 300, false);
				g.fill3DRect(210, 320, 100, 130, false);
				g.fill3DRect(315, 300, 100, 250, false);
				g.fill3DRect(420, 220, 100, 400, false);
				g.fill3DRect(525, 240, 100, 400, false);
				
				for(int i = 306; i<500; i+=20) {
					for(int j = 5; j < 100; j+=20) {
					g.setColor(Color.YELLOW);
					g.fillRect(j, i, 10, 10);
					}
				}
				
				for(int i = 425; i<525; i+=20) {
					g.fillRect(i, 225, 7, 212);
				}
				
				for(int i = 325; i<500; i+=20) {
					for(int j = 215; j < 300; j+=33) {
					g.fillRect(j, i, 10, 15);
					g.fillRect(j+15, i, 10, 15);
					}
				}
				
				for(int i = 112;i<200;i+=20) {
					for(int j = 255; j<500;j+=50) {
					g.fillRect(i, j, 5, 30);
					}
				}
				
				for(int i = 320;i<400;i+=20) {
					for(int j = 310; j<500;j+=15) {
					g.fillRect(i, j, 30, 2);
					}
				}
				
				for(int i = 530;i<625;i+=10) {
					for(int j = 245;j<500;j += 15) {
						g.fillRect(i, j, 4, 2);	
					}
				}

		}
	}
}
