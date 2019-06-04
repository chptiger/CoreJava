package Concept;

/**
 * if class A1 do not have A1(){} method You can define any arguments you need
 * for your constructor, but it is necessary to call one constructor of the
 * super class as the first line of your own constructor. This can be done using
 * super() or super(arguments) if class A1 have A1(){} method super() or
 * super(arguments) is not necessary
 * 
 * @author Albert Chao
 *
 */
public class constructor {
	public static void main(String[] args) {
		String c = "cat";
		String d = "dog";
		B1 b = new B1(c);
		b.sayHello();
		b.saysay();
	}
}

class B1 extends A1 {
	B1(String c) {
		super(c);
	}

	B1(String c, String d) {
		super(c);
		System.out.println(c + d);
	}

	void saysay() {
		sayHello();
	}

	String c = "dog";
	String d = "apple";
}

class A1 {
	String c = "cat";

	// A1(){
	// System.out.println("this is the default constructor of A1");
	// }
	A1(String c) {
		System.out.println(c + " this is the second constructor of A1");
	}

	void sayHello() {
		System.out.println("A1");
	}
}
