
public class Calculator extends MathOperations {

	public static void main(String[] args) {

		add(12, 1);
		multi(12, 2);
		sub(12, 4);

		MathOperations m1 = new MathOperations();
		m1.div(120, 10);

//		m1.mod(12,2);

		Calculator cal = new Calculator();
		cal.div(12, 4);

		cal.mod(12, 3);

		cal.car();

	}

	public void mod(int a, int b) {

		int c = a % b;
		System.out.println("reminder id : " + c);
	}

	public void car() {
		System.out.println("The car is red in color");
	}

}
