package project.EECE1610;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MainMethod extends Canvas implements Runnable{
	
	private static final long serialVersionUID = -605775028508762336L;

	//width and height of frame
	public static final int WIDTH = 640;
	public static final int HEIGHT = WIDTH/12 * 9;
	
	//how game will run - single threaded
	private Thread thread; 
	
	//make sure that game is running
	private boolean going = false;
	
	private Random numGen;
	
	//create instances from other classes
	private Updater updater;
	private Homepage homepage;
	private Header hud;
	private Levels levels;
	
	//states of games to switch between frames
	public enum FRAME  {
		Homepage,
		Instructions,
		Play,
		End;
	}
	
	//what state the game should start off in
	public static FRAME gameState = FRAME.Homepage;
	
	//declares images to be used in the game
	public static BufferedImage solar;
	public static BufferedImage wind;
	public static BufferedImage nonrenewable;
	public static BufferedImage outlet;
	public static BufferedImage background;
	
	//constructor method
	public MainMethod() {
		
		//initialize instance of classes
		updater = new Updater();
		hud = new Header();
		
		//create instance of class that allows for switching between frames
		homepage = new Homepage(this, updater, hud);
		
		//add listeners that allows for user interface
		this.addKeyListener(new KeyBoard(updater));
		this.addMouseListener(homepage);
	
		//create instance of class that makes the different levels
		levels = new Levels(updater, hud);
		
		//create the window for the game
		//create instance of class that has frame details
		new MainWindow(WIDTH, HEIGHT, "EECE 1610 Game", this);
		
		BufferImageLoader loader = new BufferImageLoader();
		
		//initialize images to their path
		outlet = loader.loadImage("/image/outlet.png");
		solar = loader.loadImage("/image/solar.png");
		wind = loader.loadImage("/image/wind.png");
		nonrenewable = loader.loadImage("/image/fossilfuel.png");
		background = loader.loadImage("/image/background.png");

	}
	
	//start the game
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		going = true;
	}
	
	//end the game
	public synchronized void stop() {
		try {
			thread.join();
			going = false;
		} catch(Exception e) { //similar to if statement
			e.printStackTrace(); //error statement
		}
	}
	
	//game loop - utilizes timer so that game is able to run
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while(going) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1) {
				mark();
				delta--;
			}
			if(going)
				display();
			frames++;
			
			if(System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				frames = 0;
			}
		}
		stop();
	}

	//method that allows for game to change and values to update
	private void mark() {
		if (gameState == FRAME.Play) {
			updater.mark();
			hud.mark();
			levels.mark();
			
			if(Header.HEALTH <= 0) {
				Levels.level = 1;
				gameState = FRAME.End;
				updater.clear();
			}
			
		} else if (gameState == FRAME.Homepage || gameState == FRAME.End || gameState == FRAME.Instructions) {
			homepage.mark();
		} 
	}

	//method that allows for game to change graphics
	private void display() {
		
		BufferStrategy buffer = this.getBufferStrategy();
		if(buffer == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = buffer.getDrawGraphics();
		
		g = buffer.getDrawGraphics();
		
		g.drawImage(background, 0, 0, this);
		
		if(gameState == FRAME.Play) {
			updater.display(g);
			hud.display(g);
		} else if (gameState == FRAME.Homepage || gameState == FRAME.End || gameState == FRAME.Instructions) {
			homepage.display(g);
		}
		
		g.dispose();
		buffer.show();
	}
	
	//defines borders for the objects so that they do not go out of the frame
	public static int boundry(int val, int min, int max) {
		if (val >= max) {
			return val = max;
		} else if(val <= min) {
			return val = min;
		} else {
			return val;
		}
	}
	
	//main method
	//create instance of game - allows for playing
	public static void main(String[] args) {
		new MainMethod();
	}

}
