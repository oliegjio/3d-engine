package com.olegsorokin.geometry;

public class Mesh {

	private String name;
	private Line[] ridges;
	private Vector position;
	private Vector rotation;
	
	public Mesh(String name, int ridgesCount) {
		this.name = name;
		this.ridges = new Line[ridgesCount];
	}
	
	public Mesh(String name, Line[] ridges) {
		this.name = name;
		this.ridges = ridges;
	}

	public Vector getPosition() {
		return position;
	}

	public void setPosition(Vector position) {
		this.position = position;
	}

	public Vector getRotation() {
		return rotation;
	}

	public void setRotation(Vector rotation) {
		this.rotation = rotation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Line[] getRidges() {
		return ridges;
	}


	public void setRidges(Line[] ridges) {
		this.ridges = ridges;
	}
	
}
