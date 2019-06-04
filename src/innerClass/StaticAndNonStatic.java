package innerClass;

import org.junit.Test;

/**
 * https://www.geeksforgeeks.org/static-class-in-java/ What are the differences
 * between static and non-static nested classes? 1) Nested static class doesn't
 * need reference of Outer class, but non-static nested class or inner class
 * requires outer class reference 2) Inner class can access both static and
 * non-static members of outer class. A static class can not access non-static
 * members of the outer class. It can access only static members of outer class
 * 3) An instance of inner class can not be created without an instance of outer
 * class and an inner class can reference data and methods defined in outer
 * class in which it nests, so we don't need to pass reference of an object to
 * the constructor of the inner class. For this reason inner classes can make
 * program simple and concise.
 * 
 * @author xx65
 *
 */
public class StaticAndNonStatic {
	public static String str = "static string";

	public String str2 = "non static string";

	public static class InnerStaticClass {
		// Only static members of outer class is directly accessbile in nested static
		// class
		public void print() {
			System.out.println("Message from inner static class: " + str);
		}
	}

	public class Innerclass {
		public void display() {
			System.out.println("Message from inner class: " + str + ", " + str2);
		}
	}

	@Test
	public void test() {
		StaticAndNonStatic outerClass = new StaticAndNonStatic();
		StaticAndNonStatic.Innerclass innerClass = outerClass.new Innerclass();
		innerClass.display();

		StaticAndNonStatic.InnerStaticClass innerStaticClass = new StaticAndNonStatic.InnerStaticClass();
		innerStaticClass.print();
	}
}
