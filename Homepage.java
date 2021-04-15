package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import project.MainMethod.STATE;

public class Homepage extends MouseAdapter{
	
	private MainMethod game;
	private Updater updater;
	private Random numGen;
	
	public Homepage(MainMethod game, Updater updater) {
		this.game = game;
		this.updater = updater;
	}
	
	public void mousePressed(MouseEvent e) {
		int tempx = e.getX();
		int tempy = e.getY();
		
		numGen = new Random();
		
		if(mouseOver(tempx, tempy, 210, 350, 200, 64)) {
			game.gameState = STATE.Play;
			updater.addObjects(new Player(MainMethod.WIDTH/2-32,MainMethod.HEIGHT/2+170,ID.Player,updater));
			
			for(int i=0; i<10;i++){
				updater.addObjects(new RenewableEnergy(numGen.nextInt(MainMethod.WIDTH),0,ID.RenewableEnergy));
				}
			
			for(int j=0; j<10 ; j++) {
				updater.addObjects(new NonrenewableEnergy(numGen.nextInt(MainMethod.WIDTH),0,ID.NonrenewableEnergy));
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
		Font fnt = new Font("arial", 1, 40);
		Font fnt2 = new Font("arial", 1, 30);
		Font fnt3 = new Font("arial", 1, 10);
	
		g.setFont(fnt);
		g.setColor(Color.black);
		g.drawString("Welcome to Energy Collector!", 40, 70);
		
		g.setFont(fnt2);
		g.setColor(Color.black);
		g.drawString("Start", 270, 390);
		
		g.setFont(fnt3);
		g.setColor(Color.black);
		g.drawString("Learn about renewable energy", 230, 190);
		
		g.setFont(fnt3);
		g.setColor(Color.black);
		g.drawString("Collect renewable energy", 230, 270);
		
		g.setFont(fnt3);
		g.setColor(Color.black);
		g.drawString("Avoid nonrenewable energy", 230, 280);
		
		g.setColor(Color.black);
		g.drawRect(210, 150, 200, 64);
		
		g.setColor(Color.black);
		g.drawRect(210, 250, 200, 64);
		
		g.setColor(Color.black);
		g.drawRect(210, 350, 200, 64);
	}
}
