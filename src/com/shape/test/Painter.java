package com.shape.test;

import java.util.Scanner;

public class Painter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Shape s = Factory.createObject("Rectangle");

	Rectangle r=new Rectangle();
	r.setBreadth(10);
	r.setLength(20);
	
	r.findArea();
	r.diagonals();
	r.perimeter();
	
		
		
		
	}

}
