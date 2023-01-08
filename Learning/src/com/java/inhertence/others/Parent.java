package com.java.inhertence.others;

public abstract class Parent extends GrandFather {

	public void car() {

		System.out.println("The car method from child class");
	}

	public void childCar() {

		System.out.println("This is the only method available for Child");
	}

}
