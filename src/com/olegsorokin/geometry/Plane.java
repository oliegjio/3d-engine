package com.olegsorokin.geometry;

import com.olegsorokin.geometry.Point3;
import com.olegsorokin.geometry.Vector3;

public class Plane {
	
	private Point3 position;
	private Vector3 normal;
	
	public Plane(Point3 position, Vector3 normal) {
		// Plane equation:
		// A(x - x0) + B(y - y0) + C(z - z0) = 0
		this.setPosition(position);
		this.setNormal(normal);
	}

	public Point3 getPosition() {
		return position;
	}

	public void setPosition(Point3 position) {
		this.position = position;
	}

	public Vector3 getNormal() {
		return normal;
	}

	public void setNormal(Vector3 normal) {
		this.normal = normal;
	}
	
}
