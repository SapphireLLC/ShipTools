package com.github.sapphire.shiptools;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.github.sapphire.shiptools.graphics.Splash;

public class Main {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		new Splash();
	}

}
