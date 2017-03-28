package com.olegsorokin.general;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.Point;
import org.jdesktop.swingx.JXPanel;
import java.awt.Graphics;

public class TrivialSketcher extends JXPanel {

	private Point lastPoint;
	
	public TrivialSketcher() {
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent event) {
				lastPoint = new Point(event.getX(), event.getY());
			}
		});
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent event) {
				Graphics graphics = getGraphics();
				graphics.drawLine(lastPoint.x, lastPoint.y, event.getX(), event.getY());
				lastPoint = new Point(event.getX(), event.getY());
				graphics.dispose();
			}
		});
	}
	
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
	}
	
}
