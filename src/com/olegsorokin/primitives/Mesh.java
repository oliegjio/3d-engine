package com.olegsorokin.primitives;

public class Mesh {

	private String name;
	private Vector[] vertices;
	private Vector position;
	private Vector rotation;
	
	public Mesh(String name, int verticesCount) {
		this.setName(name);
		this.setVertices(new Vector[verticesCount]);
	}

	public Vector[] getVertices() {
		return vertices;
	}

	public void setVertices(Vector[] vertices) {
		this.vertices = vertices;
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
	
}
