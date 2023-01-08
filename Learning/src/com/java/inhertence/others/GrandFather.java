package com.java.inhertence.others;

public abstract class GrandFather {

	public void car() {

		System.out.println("The car method from parent class");
	}

	public void car(String color) {

		System.out.println("The car color is" + color);
	}

	public void house() {

		System.out.println("The house with 2 flours");
	}

	public abstract void duplexHouse();
}
