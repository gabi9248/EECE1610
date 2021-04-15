package project;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.Random;

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
	
	//creates type state to show if the game is occurring
	public enum STATE  {
		Homepage,
		Play;
	}
	
	public STATE gameState = STATE.Homepage;
	
	public MainMethod() {
		updater = new Updater();
		homepage = new Homepage(this, updater);
		this.addKeyListener(new KeyBoard(updater));
		this.addMouseListener(homepage);
		
		hud = new Header();
		
		new MainWindow(WIDTH, HEIGHT, "EECE 1610 Game", this);
		
		updater.addObjects(new Player(WIDTH/2-32,HEIGHT/2+170,ID.Player,updater));
		
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
		if (gameState == STATE.Play) {
			updater.mark();
			hud.mark();
		} else if (gameState == STATE.Homepage) {
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
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		if(gameState == STATE.Play) {
			updater.display(g);
			hud.display(g);
		} else if (gameState == STATE.Homepage) {
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
