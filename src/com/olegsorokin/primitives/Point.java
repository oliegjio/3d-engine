package com.olegsorokin.primitives;

public class Point {

	private float x;
	private float y;
	private float z;
	
	public Point() {
		this.setX(0);
		this.setY(0);
		this.setZ(0);
	}
	
	public Point(float x, float y, float z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
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

	public float getZ() {
		return z;
	}

	public void setZ(float z) {
		this.z = z;
	}
	
}
