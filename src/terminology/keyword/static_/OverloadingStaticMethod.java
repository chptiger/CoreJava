package terminology.keyword.static_;

import org.junit.Test;

/**
 * Overloading:
 * 
 * Overloading is one of the feature in OOPs concept which allows you to have
 * two or more methods with same method name with difference in the parameters.
 * 
 * We could also call this phenomena as Compile time polymorphism.
 * 
 * @author xx65
 *
 */
public class OverloadingStaticMethod {

	public void test_overloaingStaticMethod() {
		overloading("abc");
		overloading("abc", "123");
	}

	public static void overloading(String input) {
		System.out.println(input);
	}

	public static void overloading(String input, String input2) {
		System.out.println(input);
		System.out.println(input2);
	}
}
