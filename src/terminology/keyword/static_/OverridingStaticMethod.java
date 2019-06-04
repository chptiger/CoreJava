package terminology.keyword.static_;

import org.junit.Test;

/**
 * We can not override a static method in Java
 * 
 * Unlike overloading of static method we can not overriding.
 * 
 * When we declare a method with same signature and static in both parent and
 * child class then it's not considered as Method Overriding
 * 
 * as there will not be any Runtime Polymorphism happening.
 * 
 * static is class level and override is happen between parent and child class
 * that related with instance. It's not working in there.
 * 
 * @author xx65
 *
 */
public class OverridingStaticMethod {

	@Test
	public void test_overridingStatic() {
		Parent parent = new Child();
		Parent.display();
	}
}

class Parent {
	public static void display() {
		System.out.println("parent class");
	}
}

class Child extends Parent {
	public static void display() {
		System.out.println("child class");
	}
}
