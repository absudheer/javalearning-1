package com.java.constructor;

public class Indian {

	public static void main(String args[]) {
		Person p = new Person(45, "Sudheer");

		System.out.println("Person age is:" + p.age);
		System.out.println("Person Name is:" + p.name);
		
		Indian.printIndianDetails();

	}

	protected static void printIndianDetails() {
		
		Person p = new Person(45, "Sudheer");
		System.out.println("Person age is:" + p.age);
		System.out.println("Person Name is:" + p.name);
	}

	// constructor : when ever we are creating an object of a class, the constructor
	// will be invoked
}
