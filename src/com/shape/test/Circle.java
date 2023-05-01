package com.shape.test;

public class Circle implements Shape {

	private int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	@Override
	public void findArea() {
		// TODO Auto-generated method stub
		double A = 3.14 * radius * radius;

	}

	@Override
	public void perimeter() {
		System.out.println("circumference of circle " + 2 * 3.14 * radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void diameter() {
		System.out.println("Diameter of a circle " + 2 * radius);
	}

}
