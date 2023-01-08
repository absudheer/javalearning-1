package com.java.inheritence;

public class Parent extends GrandFather {

	public static void main(String[] args) {

//		Child c = new Child();
//
//		c.car();
//		c.car("Red");
//		c.house();
		
		
		
		GrandFather p = new Parent();
		p.car();
		p.house();
//		p.childCar();
		//parent car

		
		
		Parent c = (Parent)p;
		c.childCar();
		
		
	}

	public void car() {

		System.out.println("The car method from child class");
	}
	
	public void childCar() {

		System.out.println("This is the only method available for Child");
	}

}
