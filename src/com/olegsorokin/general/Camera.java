package com.olegsorokin.general;

import com.olegsorokin.geometry.Vector;

public class Camera {

	private Vector position;
	private Vector target;
	
	public Camera() {
		
	}
	
	public void setPosition(Vector position) {
		this.position = position;
	}
	
	public Vector getPosition() {
		return this.position;
	}
	
	public void setTarget(Vector target) {
		this.target = target;
	}
	
	public Vector getTarget() {
		return this.target;
	}
	
}
