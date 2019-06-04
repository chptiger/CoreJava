package Concept;

// overriding dynamic binding and happens in running time

public class Override {

	public static void main(String[] args) {
		A b = new B();// A can only see method in both A and B
		b.sayHello();// hello B
		// b.sayBye();// through compile error.

		B bb = new B();
		bb.sayBye();// Bye B
	}

	static class B extends A {
		public void sayHello() {
			System.out.println("hello B");
		}

		public void sayBye() {
			System.out.println("Bye B");
		}
	}

	static class A {
		public void sayHello() {
			System.out.println("hello A");
		}
	}

}
