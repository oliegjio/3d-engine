package com.olegsorokin.primitives;

public class VectorT {

	private float x;
	private float y;
	private float z;
	
	public VectorT() {
		this.x = 0;
		this.y = 0;
		this.z = 0;
	}
	
	public VectorT(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public VectorT multiply(VectorT vector) {
		return vector;
	}
	
}
