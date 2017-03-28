package com.olegsorokin.primitives;

public class Mesh {

	private String name;
	private VectorT[] vertices;
	private VectorT position;
	private VectorT rotation;
	
	public Mesh(String name, int verticesCount) {
		this.setName(name);
		this.setVertices(new VectorT[verticesCount]);
	}

	public VectorT[] getVertices() {
		return vertices;
	}

	public void setVertices(VectorT[] vertices) {
		this.vertices = vertices;
	}

	public VectorT getPosition() {
		return position;
	}

	public void setPosition(VectorT position) {
		this.position = position;
	}

	public VectorT getRotation() {
		return rotation;
	}

	public void setRotation(VectorT rotation) {
		this.rotation = rotation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
