package com.olegsorokin.geometry;

import com.olegsorokin.geometry.Line3;
import com.olegsorokin.geometry.Point3;

public class Ray3 extends Line3 {
	
	private float distance;
	
	public Ray3(Point3 firstPoint, Point3 secondPoint, float distance) {
		super(firstPoint, secondPoint);
		
		this.firstPoint = firstPoint;
		this.secondPoint = secondPoint;
		this.distance = distance;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}
	
}
