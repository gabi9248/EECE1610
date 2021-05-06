package project.EECE1610;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JPanel {
	
	private static final long serialVersionUID = 5786218614721191114L;

	//constructor that contains details about the frame
	public MainWindow(int width, int height, String title, MainMethod method) {
		JFrame frame = new JFrame(title);
		
		//makes the frame constant
		frame.setPreferredSize(new Dimension(width,height));
		frame.setMaximumSize(new Dimension(width,height));
		frame.setMinimumSize(new Dimension(width,height));
		
		//initiates a close on this frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//makes frame constant
		frame.setResizable(false);
		
		//frame does not located relative to a specific component
		frame.setLocationRelativeTo(null);
		
		 //add class into the frame
		frame.add(method);
		frame.setVisible(true);
		
		//running start method
		method.start(); 
	}
	
}
