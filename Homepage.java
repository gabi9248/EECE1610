package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Homepage extends JFrame{
	
	private JButton startButton; //triggers start of the game
	private JLabel startLabel; //label with the name of the game
	private JLabel welcomeLabel; //label that welcomes user
	
	private JLabel instructionsLabel1;
	private JLabel instructionsLabel2;
	private JLabel instructionsLabel3;
	
	Homepage() {
		
		GridBagConstraints positionConst = null;
		
		//set frame's title
		setTitle("Homepage");
		
		//set label to instruct user to press start
		welcomeLabel = new JLabel("Welcome to Tilt Game!");
		startLabel = new JLabel("Press the start button to begin");
		instructionsLabel1 = new JLabel("Use your arrow keys to keeps the scale balanced");
		instructionsLabel2 = new JLabel("Create a perfect balance to gain a point");
		instructionsLabel3 = new JLabel("")
		
		
		//create the "Start" button
		startButton = new JButton("Start Game");
		
		//use "this" class to handle button presses
//		startButton.addActionListener(this);
		
		//Use a GridBagLayout
		setLayout(new GridBagLayout());
		positionConst = new GridBagConstraints();
		
		//specify component's grid location;
		positionConst.gridx = 0;
		positionConst.gridy = 0;
		positionConst.insets = new Insets(100, 100, 100, 100);
		add(welcomeLabel, positionConst);
		
		positionConst.gridx = 0;
		positionConst.gridy = 1;
		positionConst.insets = new Insets(100, 100, 100, 100);
		add(startLabel, positionConst);
		
		positionConst.gridx = 0;
		positionConst.gridy = 2;
		positionConst.insets = new Insets(100, 100, 100, 100);
		add(startButton, positionConst);
	}
	

	public static void main(String[] args) {
		Homepage myFrame = new Homepage();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);

	}
	
}
