package com.array.exercise;

public class Moving {

	public static void main(String[] args) {

		LambdaExp l = (int a, int b) -> System.out.println("Addition :" + (a + b));
		l.addition(40, 40);

	}
}

/*
 * LambdaExp l =(int a, int b) -> {return a+b;}; int b = l.addition(10, 40);
 * System.out.println(b);
 */