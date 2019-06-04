package Concept;

public class class_extends {
	public static void main(String[] args) {
		B b = new B();
		b.sayHello();
		b.saysay();
	}
}

class B extends A {
	void saysay() {
		sayHello();
	}
}

class A {
	void sayHello() {
		System.out.println("A");
	}
}
