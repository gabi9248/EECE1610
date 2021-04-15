package project.EECE1610;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainWindow extends Canvas{
	
	private static final long serialVersionUID = 5786218614721191114L;

	public MainWindow(int width, int height, String title, MainMethod method) {
		JFrame frame = new JFrame(title);
		
		frame.setPreferredSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(method); //add class into the frame
		frame.setVisible(true);
		method.start(); //running start method
	}
	
}
