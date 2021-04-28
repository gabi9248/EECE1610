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

	public static final int WIDTH = 640;
	public static final int HEIGHT = WIDTH/12 * 9;
	
	private Thread thread; //how game will run - single threaded
	private boolean going = false;
	private Random numGen;
	
	private Updater updater;
	private Homepage homepage;
	private Header hud;
	private Levels levels;
	
	//creates type state to show if the game is occurring
	public enum FRAME  {
		Homepage,
		Play,
		End;
	}
	
	public static FRAME gameState = FRAME.Homepage;
	
	public MainMethod() {
		updater = new Updater();
		hud = new Header();
		homepage = new Homepage(this, updater, hud);
		this.addKeyListener(new KeyBoard(updater));
		this.addMouseListener(homepage);
	
		levels = new Levels(updater, hud);
		
		new MainWindow(WIDTH, HEIGHT, "EECE 1610 Game", this);
		
		updater.addObjects(new Player(WIDTH/2-32,HEIGHT/2+170,ID.Player,updater));
		
		updater.addObjects(new RenewableEnergy(numGen.nextInt(WIDTH),0,ID.RenewableEnergy));
		
		/*
		
		numGen = new Random();
		
		for(int i=0; i<10;i++){
			updater.addObjects(new RenewableEnergy(numGen.nextInt(WIDTH),0,ID.RenewableEnergy));
			}
		
		for(int j=0; j<10 ; j++) {
			updater.addObjects(new NonrenewableEnergy(numGen.nextInt(WIDTH),0,ID.NonrenewableEnergy));
			
		}
		
		*/
	}
	
	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		going = true;
	}
	
	public synchronized void stop() {
		try {
			thread.join();
			going = false;
		} catch(Exception e) { //similar to if statement
			e.printStackTrace(); //error statement
		}
	}
	
	public void run() { //game loop
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

	private void mark() {
		if (gameState == FRAME.Play) {
			updater.mark();
			hud.mark();
			levels.mark();
			
			if(Header.HEALTH <= 0) {
				Levels.level1 = 1;
				gameState = FRAME.End;
				updater.clear();
			}
			
		} else if (gameState == FRAME.Homepage || gameState == FRAME.End) {
			homepage.mark();
		} 
	}

	private void display() {
		
		BufferStrategy buffer = this.getBufferStrategy();
		if(buffer == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = buffer.getDrawGraphics();
		
		g = buffer.getDrawGraphics();
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		/*
		BufferedImage imgtest;
		try {
			imgtest = ImageIO.read(new File("C:/Users/Gabi/eclipse-workspace/EECE1610_Projects/EECE1610_Project/src/image/lightning.png"));
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		Image img = Toolkit.getDefaultToolkit().createImage("C:/Users/Gabi/eclipse-workspace/EECE1610_Projects/EECE1610_Project/src/image/lightning.png");
		g.drawImage(img,0,0,this);
		*/
		
		if(gameState == FRAME.Play) {
			updater.display(g);
			hud.display(g);
		} else if (gameState == FRAME.Homepage || gameState == FRAME.End) {
			homepage.display(g);
		}
		
		g.dispose();
		buffer.show();
	}
	
	public static int boundry(int val, int min, int max) {
		//defines borders for the objects so that they do not go out of the frame
		if (val >= max) {
			return val = max;
		} else if(val <= min) {
			return val = min;
		} else {
			return val;
		}
	}
	
	public static void main(String[] args) {
		new MainMethod();
	}

}
