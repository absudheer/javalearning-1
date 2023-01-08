package com.java.inheritence;

import com.java.constructor.Indian;

public class Engine extends Indian {

	public void gare() {

		System.out.println("This is gare");
	}

	public static void main(String args[]) {

		Indian.printIndianDetails();

	}

	protected void powerEngine() {
		System.out.println("Power enginee behaviour");
	}

}
