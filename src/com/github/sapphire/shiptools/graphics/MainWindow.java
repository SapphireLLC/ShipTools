package com.github.sapphire.shiptools.graphics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

public class MainWindow extends JFrame implements ActionListener{

	private static ImageIcon image = new ImageIcon(Splash.class.getResource("logo.png"));
	
	private static JPanel options = new JPanel();
	private static JPanel mainActivity = new JPanel();
	private static JPanel topBar = new JPanel();
	
	public MainWindow() {
		super("Ship Tools v1 SapphireLLC");
		
		this.setIconImage(image.getImage());
		this.setSize(700,600);
		this.setLayout(null);
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
		this.setAlwaysOnTop(true);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		options.setVisible(true);
		options.setBounds(0,0,200,600);
		options.setLayout(null);
		options.setBackground(new Color(236,237,229));
		
		topBar.setVisible(true);
		topBar.setBounds(200,0,500,150);
		topBar.setLayout(null);
		topBar.setBackground(new Color(236,237,229));
		
		mainActivity.setVisible(true);
		mainActivity.setBounds(200,150, 500, 500);
		mainActivity.setLayout(null);
		mainActivity.setBackground(new Color(240, 230, 140));
		mainActivity.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
		
		this.add(options);
		this.add(topBar);
		this.add(mainActivity);
		
	}
	
	public static void start() {
		new MainWindow();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
