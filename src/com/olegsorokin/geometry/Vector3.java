package com.olegsorokin.geometry;

public class Vector3 {

	private double x;
	private double y;
	private double z;
	
	public Vector3() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Vector3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public void normalize() {
		this.x = Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2));
	}
	
	public Vector3 getReversed() {
		return new Vector3(- this.x, - this.y, - this.z);
	}
	
	public Vector3 multiply(Vector3 vector) {
		return vector;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}
	
}
