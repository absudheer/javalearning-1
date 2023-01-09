package com.java.interfaces;

public class CarEngine implements EngineInterface {

	public static void main(String[] args) {
		
		
		EngineInterface e = new CarEngine();
		
		e.gear();
	}

	@Override
	public void gear() {

		System.out.println("Gear method of CarEngine");

	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		System.out.println("breaking method of CarEngine");

	}

	@Override
	public void cluch() {
		// TODO Auto-generated method stub
		System.out.println("cluch method of CarEngine");

	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		System.out.println("fuel method of CarEngine");

	}

}
