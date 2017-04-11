package com.olegsorokin.geometry;

import com.olegsorokin.geometry.Line3;
import com.olegsorokin.geometry.Plane;
import com.olegsorokin.geometry.Point3;

public class Helper {

	public static Point3 planeWithLineIntersection(Plane plane, Line3 line) {
		Vector3 normal = plane.getNormal();
		Point3 position = plane.getPosition();
		Point3 firstPoint = line.getFirstPoint();
		Point3 secondPoint = line.getSecondPoint();
		return new Point3(
				(normal.getX() * position.getX() + normal.getY() * position.getY() - normal.getY() * firstPoint.getY() + (normal.getY() * firstPoint.getX() * (secondPoint.getY() - firstPoint.getY())) / (secondPoint.getX() - firstPoint.getX()) + normal.getZ() * position.getZ() - normal.getZ() * firstPoint.getZ() + (normal.getZ() * firstPoint.getX() * (secondPoint.getZ() - firstPoint.getZ())) / (secondPoint.getX() - firstPoint.getX())) / (normal.getX() + (normal.getY() * (secondPoint.getY() - firstPoint.getY())) / (secondPoint.getX() - firstPoint.getX()) + (normal.getZ() * (secondPoint.getZ() - firstPoint.getZ())) / (secondPoint.getX() - firstPoint.getX())),
	            (normal.getX() * position.getX() - normal.getX() * firstPoint.getX() + normal.getY() * position.getY() + (normal.getX() * firstPoint.getY() * (secondPoint.getX() - firstPoint.getX())) / (secondPoint.getY() - firstPoint.getY()) + normal.getZ() * position.getZ() - normal.getZ() * firstPoint.getZ() + (normal.getZ() * firstPoint.getY() * (secondPoint.getZ() - firstPoint.getZ())) / (secondPoint.getY() - firstPoint.getY())) / (normal.getY() + (normal.getX() * (secondPoint.getX() - firstPoint.getX())) / (secondPoint.getY() - firstPoint.getY()) + (normal.getZ() * (secondPoint.getZ() - firstPoint.getZ())) / (secondPoint.getY() - firstPoint.getY())),
	            (normal.getX() * position.getX() - normal.getX() * firstPoint.getX() + normal.getY() * position.getY() - normal.getY() * firstPoint.getY() + normal.getZ() * position.getZ() + (normal.getX() * firstPoint.getZ() * (secondPoint.getX() - firstPoint.getX())) / (secondPoint.getZ() - firstPoint.getZ()) + (normal.getY() * firstPoint.getZ() * (secondPoint.getY() - firstPoint.getY())) / (secondPoint.getZ() - firstPoint.getZ())) / (normal.getZ() + (normal.getX() * (secondPoint.getX() - firstPoint.getX())) / (secondPoint.getZ() - firstPoint.getZ()) + (normal.getY() * (secondPoint.getY() - firstPoint.getY())) / (secondPoint.getZ() - firstPoint.getZ()))
		);
	}
	
}
