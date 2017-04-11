package com.olegsorokin.general;

import com.olegsorokin.geometry.Vector3;
import com.olegsorokin.geometry.Point3;
import com.olegsorokin.geometry.Plane;
import com.olegsorokin.geometry.Rect;

public class Camera {

	private Point3 position;
	private Vector3 target;
	private Plane plane;
	private float distance;
	private Rect bounds;
	
	public Camera(Point3 position, Vector3 target, float distance, Rect bounds) {
		this.position = position;
		this.target = target;
		this.distance = distance;
		this.bounds = bounds;
		
		Point3 planePosition = position.addVector(target);
		this.plane = new Plane(planePosition, target);
	}
	
	public Point3 getPosition() {
		return this.position;
	}
	
	public Vector3 getTarget() {
		return this.target;
	}

	public Plane getPlane() {
		return plane;
	}
	
	public float getDistance() { return this.distance; }
	public Rect getBounds() { return this.bounds; }
	
}
