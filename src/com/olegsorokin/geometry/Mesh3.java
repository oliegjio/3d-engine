package com.olegsorokin.geometry;

public class Mesh3 {

	private String name;
	private Line3[] ridges;
	private Vector3 position;
	private Vector3 rotation;
	
	public Mesh3(String name, int ridgesCount) {
		this.name = name;
		this.ridges = new Line3[ridgesCount];
	}
	
	public Mesh3(String name, Line3[] ridges) {
		this.name = name;
		this.ridges = ridges;
	}

	public Vector3 getPosition() {
		return position;
	}

	public void setPosition(Vector3 position) {
		this.position = position;
	}

	public Vector3 getRotation() {
		return rotation;
	}

	public void setRotation(Vector3 rotation) {
		this.rotation = rotation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Line3[] getRidges() {
		return ridges;
	}


	public void setRidges(Line3[] ridges) {
		this.ridges = ridges;
	}
	
}
