package com.shapes;

import java.util.List;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private List<Point> points;
	
	public Point getPointA() {
		return pointA;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void Draw() {
		System.out.println(getPointA().getX()+" Triangle drawn"+getPointA().getY()+" "+points.get(0).getX());
	}

}
