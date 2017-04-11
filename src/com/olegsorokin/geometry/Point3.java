package com.olegsorokin.geometry;

import com.olegsorokin.geometry.Vector3;

public class Point3 {

	private double x;
	private double y;
	private double z;
	
	public Point3() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public Point3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Point3 subsctractVector(Vector3 vector) {
		return new Point3(this.x - vector.getX(), this.y - vector.getY(), this.z - vector.getZ());
	}
	
	public Point3 addVector(Vector3 vector) {
		return new Point3(this.x + vector.getX(), this.y + vector.getY(), this.z + vector.getZ());
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
