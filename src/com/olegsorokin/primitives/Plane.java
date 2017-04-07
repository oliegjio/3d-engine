package com.olegsorokin.primitives;

import com.olegsorokin.primitives.Point;
import com.olegsorokin.primitives.Vector;

public class Plane {
	
	private Point position;
	private Vector normal;
	
	public Plane(Point position, Vector normal) {
		this.setPosition(position);
		this.setNormal(normal);
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Vector getNormal() {
		return normal;
	}

	public void setNormal(Vector normal) {
		this.normal = normal;
	}
	
}
