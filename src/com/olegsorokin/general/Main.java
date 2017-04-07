package com.olegsorokin.general;

import javax.swing.JFrame;
import org.jdesktop.swingx.JXFrame;
import java.awt.BorderLayout;
import com.olegsorokin.general.Screen;

public class Main {
	
	public static void main(String[] args) {
		JFrame frame = new JXFrame("3D Engine");
		
		frame.getContentPane().add(new Screen(), BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}
	
}
