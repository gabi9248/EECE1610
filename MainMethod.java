package project;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

public class MainMethod extends Canvas implements Runnable{
	
	private static final long serialVersionUID = -605775028508762336L;

	public static final int WIDTH = 640;
	public static final int HEIGHT = WIDTH/12 * 9;
	
	private Thread thread; //how game will run - single threaded
	private boolean going = false;
	
	private Updater updater;
	
	public MainMethod() {
		updater = new Updater();
		this.addKeyListener(new KeyBoard(updater));
		new MainWindow(WIDTH, HEIGHT, "EECE 1610 Game", this);
		updater.addObjects(new Player(WIDTH/2-32,HEIGHT/2+170,ID.Player));
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
		}catch(Exception e) { //similar to if statement
			e.printStackTrace(); //error statement
		}
	}
	
	public void run() { //game loop
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
		updater.mark();
	}
	
	private void display() {
		BufferStrategy buffer = this.getBufferStrategy();
		if(buffer == null) {
			this.createBufferStrategy(3);
			return;
		}
		Graphics g = buffer.getDrawGraphics();
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		updater.display(g);
		
		g.dispose();
		buffer.show();
	}
	
	public static void main(String[] args) {
		new MainMethod();
	}

}
