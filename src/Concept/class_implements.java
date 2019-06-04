package Concept;

public class class_implements {
	public static void main(String[] args) {
		test_implement ti = new test_implement();
		ti.sayHello();
	}
}

class test_implement implements test {

	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
	}
}

interface test {
	void sayHello();
}