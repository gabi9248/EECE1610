package project.EECE1610;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import project.EECE1610.MainMethod.FRAME;

//class that contains the different frames
public class Homepage extends MouseAdapter{
	
	private MainMethod game;
	private Updater updater;
	private Random numGen;
	private Header hud;
	
	//constructor method
	public Homepage(MainMethod game, Updater updater, Header hud) {
		this.game = game;
		this.updater = updater;
		this.hud = hud;
	}
	
	//method for what happens if mouse is clicked in different frames
	public void mousePressed(MouseEvent e) {
		//temporary x and y variables - determines coordinates
		int tempx = e.getX();
		int tempy = e.getY();
		
		numGen = new Random();
		
		//game state is in the homepage
		//transitions from the homepage to the instructions page
		if(MainMethod.gameState == FRAME.Homepage) {
			if(mouseOver(tempx, tempy, 170, 85, 291, 50)) {
				game.gameState = FRAME.Instructions;
			}
		}
		
		//game state is in the instructions page
		//transitions from the instructions page to the play page
		if(MainMethod.gameState == FRAME.Instructions) {
			if(mouseOver(tempx, tempy, 212, 175, 200, 40)) {
				game.gameState = FRAME.Play;
				//adds player
				updater.addObjects(new Player(290,385,ID.Player,updater));
			}
		}
		
		//games state is in the game over (end) page
		//transitions from the game over page to the play page or exits the frame
		if(MainMethod.gameState == FRAME.End) {
			if(mouseOver(tempx,tempy,285, 166, 115, 20)) {
				//plays again
				MainMethod.gameState = FRAME.Play;
				
				//re-adds player
				updater.addObjects(new Player(290,385,ID.Player,updater));
				
				//clears the objects
				//re-initializes the health, level, and score
				updater.clear();
				Header.HEALTH = 100;
				Header.LEVEL = 1;
				Header.SCORE = 0;
			}
			
			//exits game - exit button
			if(mouseOver(tempx,tempy, 275, 205, 115, 20)) {
				System.exit(1);
			}
			
			
		}
	}
	
	//method that happens if the mouse if not clicked
	public void mouseReleased(MouseEvent e) {
		
	}

	//method that returns if the mouse is within a specific rectangle
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
	
	//method that changes the display for different game states
	public void display(Graphics g) {
		
		//homepage display
		if (MainMethod.gameState == FRAME.Homepage) {
			Font fnt = new Font("serif", 1, 40);
			Font fnt2 = new Font("serif", 1, 30);
			
			g.setFont(fnt);
			g.setColor(Color.black);
			g.drawString("Welcome to Energy Collector!", 50, 70);
		
			g.setFont(fnt2);
			g.setColor(Color.black);
			g.drawString("Click Here to Start", 190, 120);
			g.drawRect(175, 90, 280, 40);
			g.drawRect(170, 85, 291, 50);
			
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
		
		//instructions page display
		} else if (MainMethod.gameState == FRAME.Instructions) {
				Font fnt = new Font("serif", 1, 20);
				Font fnt1 = new Font("serif", 1, 15);
				Font fnt2 = new Font("serif", 1, 15);
				
				g.setFont(fnt);
				g.setColor(Color.black);
				g.drawString("Renewable is an environmental-friendly alternative", 110,50);
				g.drawString(" to nonrenewable energy and will provide energy for the future!", 55, 75);
				
				g.setFont(fnt1);
				g.drawString("Light up your city by collecting as much power as you can", 140, 110);
				g.drawString("Move your outlet using the right and left arrow keys to collect wind and solar energy", 65, 130);
				g.drawString("Be sure to avoid fossil fuels so that your health does not go down", 120, 150);
				
				g.drawString("Press here to continue", 240, 200);
			
				g.drawRect(222, 180, 175, 30);
				g.drawRect(215, 175, 188, 40);
				
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
				
		//game over page display
		} else if (MainMethod.gameState == FRAME.End) {
				Font fnt = new Font("serif", 1, 40);
				Font fnt2 = new Font("serif", 1, 30);
				Font fnt3 = new Font("serif", 1, 20);
				Font fnt4 = new Font("serif", 1, 10);
				
				g.setFont(fnt);
				g.setColor(Color.black);
				g.drawString("Game Over", 235, 70);
			
				g.setFont(fnt2);
				g.drawString("You collected " + Header.SCORE + " watts!", 200, 110);
				
				g.setFont(fnt3);
				if (Header.SCORE >= 0 && Header.SCORE <= 10) {
					g.drawString("Keep going to provide more power!", 190, 142);
				} else if (Header.SCORE >= 25 && Header.SCORE <= 50) {
					g.drawString("Nice job! You're city is almost lit!", 200, 142);
				} else if (Header.SCORE >= 50 && Header.SCORE <= 75) {
					g.drawString("Almost there! Play again to collect more power!", 150, 142);
				} else {
					g.drawString("Congratulations! You lit up your city!!", 180, 142);
				}
				
				g.setFont(fnt4);
				g.drawRect(275, 166, 115, 20);
				g.drawRect(270, 161, 125, 30);
				g.drawString("Click Here to Play Again",280 ,180);
				
				g.drawRect(275, 205, 115, 20);
				g.drawRect(270, 200, 125, 30);
				g.drawString("Click Here to Quit", 293, 218);
				
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
