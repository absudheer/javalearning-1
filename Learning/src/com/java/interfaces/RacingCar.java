package com.java.interfaces;

public class RacingCar implements RacingEngineInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RacingEngineInterface re = new RacingCar();

		re.gear();

	}

	@Override
	public void gear() {

		System.out.println("Gear from Racing car");
	}

	@Override
	public void breaking() {
		// TODO Auto-generated method stub
		System.out.println("Gear from Racing car");

	}

	@Override
	public void cluch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fastMode() {
		// TODO Auto-generated method stub

	}

}
