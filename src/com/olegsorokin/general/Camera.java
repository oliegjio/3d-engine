package com.olegsorokin.general;

import com.olegsorokin.primitives.VectorT;

public class Camera {

	private VectorT position;
	private VectorT target;
	
	public Camera() {
		
	}
	
	public void setPosition(VectorT position) {
		this.position = position;
	}
	
	public VectorT getPosition() {
		return this.position;
	}
	
	public void setTarget(VectorT target) {
		this.target = target;
	}
	
	public VectorT getTarget() {
		return this.target;
	}
	
}
