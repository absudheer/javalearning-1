package com.java.inhertence.others;

public class Son extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandFather gf = new Son();
		gf.duplexHouse();

		// We can't instantiate/ create an obj of abstract class
//		Parent p = new Parent();

	}

	public void sonMethod() {

		System.out.println("method from Son");
	}

	@Override
	public void duplexHouse() {
		System.out.println("Badluck or Goodluck with duplex house");
	}

}
