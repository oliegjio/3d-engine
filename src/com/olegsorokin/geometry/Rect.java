package com.olegsorokin.geometry;

import com.olegsorokin.geometry.Point2;

public class Rect {
	
	private Point2 firstPoint;
	private Point2 secondPoint;
	private Point2 thirdPoint;
	private Point2 fourthPoint;
	
	/*
	 * Where "#" is points:
	 * 
	 * #------|
	 * |      |
	 * |      |
	 * |      |
	 * |------#
	 */
	public Rect(Point2 firstPoint, Point2 secondPoint) {
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
		this.thirdPoint = new Point2(secondPoint.getX(), firstPoint.getY());
		this.fourthPoint = new Point2(firstPoint.getX(), secondPoint.getY());
	}
	
	public Point2 getFirstPoint() { return this.firstPoint; }
	public Point2 getSecondPoint() { return this.secondPoint; }
	public Point2 getThirdPoint() { return this.thirdPoint; }
	public Point2 getFouthPoint() { return this.fourthPoint; }
	
}
