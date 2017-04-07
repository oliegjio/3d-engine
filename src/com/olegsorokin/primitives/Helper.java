package com.olegsorokin.primitives;

import com.olegsorokin.primitives.Plane;
import com.olegsorokin.primitives.Line;
import com.olegsorokin.primitives.Point;

public class Helper {

	public static Point planeWithLineIntersection(Plane plane, Line line) {
		Vector normal = plane.getNormal();
		Point position = plane.getPosition();
		Point firstPoint = line.getFirstPoint();
		Point secondPoint = line.getSecondPoint();
		return new Point(
				(normal.getX() * position.getX() + normal.getY() * position.getY() - normal.getY() * firstPoint.getY() + (normal.getY() * firstPoint.getX() * (secondPoint.getY() - firstPoint.getY())) / (secondPoint.getX() - firstPoint.getX()) + normal.getZ() * position.getZ() - normal.getZ() * firstPoint.getZ() + (normal.getZ() * firstPoint.getX() * (secondPoint.getZ() - firstPoint.getZ())) / (secondPoint.getX() - firstPoint.getX())) / (normal.getX() + (normal.getY() * (secondPoint.getY() - firstPoint.getY())) / (secondPoint.getX() - firstPoint.getX()) + (normal.getZ() * (secondPoint.getZ() - firstPoint.getZ())) / (secondPoint.getX() - firstPoint.getX())),
	            (normal.getX() * position.getX() - normal.getX() * firstPoint.getX() + normal.getY() * position.getY() + (normal.getX() * firstPoint.getY() * (secondPoint.getX() - firstPoint.getX())) / (secondPoint.getY() - firstPoint.getY()) + normal.getZ() * position.getZ() - normal.getZ() * firstPoint.getZ() + (normal.getZ() * firstPoint.getY() * (secondPoint.getZ() - firstPoint.getZ())) / (secondPoint.getY() - firstPoint.getY())) / (normal.getY() + (normal.getX() * (secondPoint.getX() - firstPoint.getX())) / (secondPoint.getY() - firstPoint.getY()) + (normal.getZ() * (secondPoint.getZ() - firstPoint.getZ())) / (secondPoint.getY() - firstPoint.getY())),
	            (normal.getX() * position.getX() - normal.getX() * firstPoint.getX() + normal.getY() * position.getY() - normal.getY() * firstPoint.getY() + normal.getZ() * position.getZ() + (normal.getX() * firstPoint.getZ() * (secondPoint.getX() - firstPoint.getX())) / (secondPoint.getZ() - firstPoint.getZ()) + (normal.getY() * firstPoint.getZ() * (secondPoint.getY() - firstPoint.getY())) / (secondPoint.getZ() - firstPoint.getZ())) / (normal.getZ() + (normal.getX() * (secondPoint.getX() - firstPoint.getX())) / (secondPoint.getZ() - firstPoint.getZ()) + (normal.getY() * (secondPoint.getY() - firstPoint.getY())) / (secondPoint.getZ() - firstPoint.getZ()))
		);
	}
	
}
