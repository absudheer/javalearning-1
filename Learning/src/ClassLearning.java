
public class ClassLearning {

	static int i = 10;
	int y = 11;

	public static void main(String[] args) {

		ClassLearning obj = new ClassLearning();
		obj.nonStaticMethod();
		staticMethod();
	}

	public ClassLearning() {

		System.out.println("Constructor ..");
	}

	// Method
	public static void staticMethod() {
		System.out.println("First Class");
	}

	public void nonStaticMethod() {
		System.out.println("nonStaticMethod Class");
	}

	static {
		System.out.println("static block");
	}

	{
		System.out.println("Non Static block");
	}

}
