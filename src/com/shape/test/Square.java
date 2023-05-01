package com.shape.test;

public class Square implements Shape {

	private int sides;

	public Square() {
		// TODO Auto-generated constructor stub
	}

	public Square(int sides) {
		// TODO Auto-generated constructor stub

		this.sides = sides;
	}

	@Override
	public void findArea() {
		int area = sides * sides;
		System.out.println("Arae of Sqaure " + area);

	}

	@Override
	public void perimeter() {
		int perimeter = 4 * sides;
		System.out.println("Perimeter of Square" + perimeter);

	}

	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public void diagonals() {
		System.out.println(sides * Math.sqrt(2));

	}

}
