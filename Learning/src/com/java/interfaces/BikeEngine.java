package com.java.interfaces;

public class BikeEngine implements EngineInterface {

	public static void main(String[] args) {

		EngineInterface e = new BikeEngine();

		e.gear();
	}

	@Override
	public void gear() {

		System.out.println("Gear method of BikeEngine");

	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		System.out.println("breaking method of BikeEngine");

	}

	@Override
	public void cluch() {

		// TODO Auto-generated method stub
		System.out.println("cluch method of BikeEngine");

	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		System.out.println("fuel method of BikeEngine");

	}

}
