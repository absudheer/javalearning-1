package com.java.finalkeyword;

public class Child extends Parent{

	final String name = "Hari";

	public static void main(String[] args) {

		Parent c = new Child();
		c.house();
			
		Child b = (Child) c;
		
//		b.name = "Sudheer";
		
		
		System.out.println("The name is :"+ b.name);
		
		
	}
// final method can't be overridden
//	public void house() {
//		
//		System.out.println("This is a very beautiful house than my Parent");
//	}

}


//final class : Any class that is defined as final, it can't be extended
//final method: If a method defined as final, we can't override it.
//final variable: Any variable that is defined as final, we can't modify/change the value of it.