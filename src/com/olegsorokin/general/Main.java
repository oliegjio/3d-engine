package com.olegsorokin.general;

import javax.swing.JFrame;
import org.jdesktop.swingx.JXFrame;
import java.awt.BorderLayout;
import com.olegsorokin.general.Screen;
import com.olegsorokin.geometry.Line;
import com.olegsorokin.geometry.Mesh;
import com.olegsorokin.geometry.Point;

public class Main {
	
	public static final int SCREEN_WIDTH = 500;
	public static final int SCREEN_HEIGHT = 500;
	
	public static void main(String[] args) {
		JFrame frame = new JXFrame("3D Engine");
		
		Mesh[] objects = new Mesh[1];
		
		// One-line mesh
		Line[] ridges = new Line[1];
		ridges[0] = new Line(new Point(0, 0, 0), new Point(10, 10, 10));
		objects[1] = new Mesh("Line", ridges);
		
		frame.getContentPane().add(new Screen(), BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setVisible(true);
	}
	
}
