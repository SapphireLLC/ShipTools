package com.github.sapphire.shiptools.graphics;

import javax.swing.*;

public class Splash extends JFrame{
	
	private static int barValue = 0;
	
	private static JLabel logo = new JLabel();
	
	private static JProgressBar progressBar = new JProgressBar();
	
	private static ImageIcon image = new ImageIcon(Splash.class.getResource("logo.png"));
	
	public Splash() {
		super("Ship Tools v1 SapphireLLC");
		logo.setIcon(image);
		
		this.setSize(600,300);
		this.setLayout(null);
		this.setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
		this.setAlwaysOnTop(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		progressBar.setValue(barValue);
		progressBar.setStringPainted(true);
		progressBar.setBounds(100, 160, 400, 20);
		
		logo.setBounds(120, -30, 300, 300);
		
		this.add(logo);
		this.add(progressBar);
		
		fill();
		
		this.setVisible(false);
		this.dispose();
		
		MainWindow.start();
		
	}
	
	private static void fill() {
		
		
		while(barValue<=100) {
			
			progressBar.setValue(barValue);
			
			barValue+=5;
			
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}