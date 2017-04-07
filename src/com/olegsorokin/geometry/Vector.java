package com.olegsorokin.geometry;

public class Vector {

	private float x;
	private float y;
	private float z;
	
	public Vector() {
		this.setX(0);
		this.setY(0);
		this.setZ(0);
	}
	
	public Vector(float x, float y, float z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}
	
	public Vector multiply(Vector vector) {
		return vector;
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
