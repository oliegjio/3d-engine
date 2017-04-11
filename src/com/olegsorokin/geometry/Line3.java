package com.olegsorokin.geometry;

import com.olegsorokin.geometry.Point3;

public class Line3 {

	protected Point3 firstPoint;
	protected Point3 secondPoint;
	
	public Line3(Point3 firstPoint, Point3 secondPoint) {
		// Line equation:
		// (x - x1)/(x2 - x1) = (y - y1)/(y2 - y1) = (z - z1)/(z2 - z1)
		this.setFirstPoint(firstPoint);
		this.setSecondPoint(secondPoint);
	}

	public Point3 getFirstPoint() {
		return firstPoint;
	}

	public void setFirstPoint(Point3 firstPoint) {
		this.firstPoint = firstPoint;
	}

	public Point3 getSecondPoint() {
		return secondPoint;
	}

	public void setSecondPoint(Point3 secondPoint) {
		this.secondPoint = secondPoint;
	}
	
}
