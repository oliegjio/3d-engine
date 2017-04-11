package com.olegsorokin.general;

import javax.swing.JFrame;
import org.jdesktop.swingx.JXFrame;
import java.awt.BorderLayout;
import com.olegsorokin.general.Screen;
import com.olegsorokin.geometry.Helper;
import com.olegsorokin.geometry.Line3;
import com.olegsorokin.geometry.Mesh3;
import com.olegsorokin.geometry.Point2;
import com.olegsorokin.geometry.Point3;
import com.olegsorokin.geometry.Ray3;
import com.olegsorokin.geometry.Rect;
import com.olegsorokin.geometry.Vector3;

public class Main {
	
	public static final int SCREEN_WIDTH = 500;
	public static final int SCREEN_HEIGHT = 500;
	public static final float RENDER_DISTANCE = 1000;
	
	/*
	 * Algorithm:
	 * - Circle through all trace lines and for each:
	 * - Go through all meshes and check if trace line collide with a mesh
	 * - If it does - collect that point into an array
	 * - Cycle through all contact points and find closest
	 * - Append closest distance value into result array
	 */
	
	public static void main(String[] args) {
		JFrame frame = new JXFrame("3D Engine");
		
		// TODO: new Camera()
		Camera camera = new Camera(new Point3(), new Vector3(- 10, 0, 0), 10, new Rect(new Point2(-10, 10), new Point2(10, -10)));
		Line3 testLine = new Line3(new Point3(0, 0, 0), new Point3(20, 0, 0));
		Point3 interPoint = Helper.planeWithLineIntersection(camera.getPlane(), testLine);
		System.out.println(interPoint.getX());
		
		Mesh3[] objects = new Mesh3[1];
		
		// One-line mesh
		Line3[] ridges = new Line3[1];
		ridges[0] = new Line3(new Point3(0, 0, 0), new Point3(10, 10, 10));
		objects[0] = new Mesh3("Line", ridges);
		
		int dimension = SCREEN_WIDTH * SCREEN_HEIGHT;
		
//		Ray3[] rays = new Ray3[dimension];
		
		// TODO: new Point()
//		for (int i = 0; i <= dimension; i++) {
//			rays[i] = new Ray3(camera.getPosition(), new Point3(), RENDER_DISTANCE);
//		}
		
		frame.getContentPane().add(new Screen(), BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
		frame.setVisible(true);
	}
	
}
