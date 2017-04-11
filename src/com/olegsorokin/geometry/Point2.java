package com.olegsorokin.geometry;

public class Point2 {

	private float x;
	private float y;
	
	public Point2() {
		this.setX(0);
		this.setY(0);
	}
	
	public Point2(float x, float y) {
		this.setX(x);
		this.setY(y);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	
}
