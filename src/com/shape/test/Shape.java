package com.shape.test;

public interface Shape {
	public abstract void findArea();

	public abstract void perimeter();

	default void color() {
		System.out.println("All Shapes Color is Red");
	}

	static void thisShapeIs() {
		System.out.println();
	}

}
