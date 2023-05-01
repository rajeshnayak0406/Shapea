package com.shape.test;

public class Rectangle implements Shape {
	private int length;
	private int breadth;
	
	
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int length, int breadth) {

		this.length = length;
		this.breadth = breadth;

		// TODO Auto-generated constructor stub
	}

	@Override
	public void findArea() {
		int l = length * breadth;
		System.out.println("Area of Rctangle=" + " " + l);

	}

	@Override
	public void perimeter() {
		int p = 2 * (length + breadth);
		System.out.println("Perimeter of Rectangle=" + " " + p);

	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void diagonals() {
		int l2 = length * length;
		int b2 = breadth * breadth;

		int d = (int) Math.sqrt(l2 + b2);

		System.out.println("Diagonals of Rectangle: " + d);

	}

}
