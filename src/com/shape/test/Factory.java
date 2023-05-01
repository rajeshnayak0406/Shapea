package com.shape.test;

import java.util.Scanner;

public class Factory {

	private static Shape shape;// loose coupling

	public static Shape createObject(String s) {
		Scanner sc = new Scanner(System.in);
		if (s == "Rectangle") {

			System.out.println("you have to put length and braedth of Rctangle");
			int l = sc.nextInt();
			int b = sc.nextInt();

			shape = new Rectangle(l, b);
			return shape;
		} else if (s == "Square") {
			System.out.println("plaese Enter sides");
			int sids = sc.nextInt();
			shape = new Square(sids);
			return shape;
		}

		else if (s == "Circle") {
			System.out.println("Enter radius of circle");
			int radius = sc.nextInt();
			shape = new Circle(radius);
		}

		return null;

	}

}