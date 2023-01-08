
public class MathOperations {

	// SOLID

	int a = 10;
	int b = 12;

	String name = "java";

	public MathOperations() {

		System.out.println("Constructor of a class");
	}

	public MathOperations(String name) {

		System.out.println("Constructor of a class");
	}

	public static void main(String[] args) {
		
		MathOperations m = new MathOperations();

		m.div(12, 2);

		int result = add(m.a, m.b);
		add(10, 20, 22);

		System.out.println("The result of add is :" + result);
		sub(m.a, m.b);

		m.multi(12, 2);
		m.multi(m.a, m.b);

		print(m);

		// compilation poly (or) static poly

		printName();
		printName("Sudheer");
		printName("pavan");

	}

	private static void printName() {
		System.out.println("Sudheer");
	}

	private static void printName(String nameString) {
		System.out.println(nameString);
	}

	static void print(MathOperations m) {
		System.out.println("The variables: " + m.a + " and " + m.b);
		System.out.println("Name is:" + m.name);
	}

	/**
	 * @param a
	 * @param b
	 */
	public static int add(int a, int b) {
		int c = a - b;
		System.out.println("addition result is:" + c);

		return c;

	}

	/**
	 * @param a
	 * @param b
	 */
	public int div(int a, int b) {
		int c = a / b;
		System.out.println("Division result is:" + c);
		return c;
	}

	/**
	 * @param a
	 * @param b
	 */
	public static int add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println("addition result 3 numbers is:" + d);

		return d;

	}

	/**
	 * @param a
	 * @param b
	 */
	public static void multi(int a, int b) {
		int z = b * a;
		System.out.println("Muliti result is :" + z);
	}

	/**
	 * @param a
	 * @param b
	 */
	public static void sub(int a, int b) {
		int y = b - a;
		System.out.println("Subtraction result is :" + y);
	}

	public void car() {

		System.out.println("The car color is blue");
	}

}
