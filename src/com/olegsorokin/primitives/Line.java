package com.olegsorokin.primitives;

import com.olegsorokin.primitives.Point;

public class Line {

	private Point firstPoint;
	private Point secondPoint;
	
	public Line(Point firstPoint, Point secondPoint) {
		this.setFirstPoint(firstPoint);
		this.setSecondPoint(secondPoint);
	}

	public Point getFirstPoint() {
		return firstPoint;
	}

	public void setFirstPoint(Point firstPoint) {
		this.firstPoint = firstPoint;
	}

	public Point getSecondPoint() {
		return secondPoint;
	}

	public void setSecondPoint(Point secondPoint) {
		this.secondPoint = secondPoint;
	}
	
}
