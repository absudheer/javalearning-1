package com.java.inheritence;

public class Son extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GrandFather gf = new Son();
		
		gf.car();
		System.out.println("The hashcode method returns :"+gf.hashCode());
//		gf.sonMethod();
	}

	
	public void sonMethod() {
		
		System.out.println("method from Son");
	}
}
