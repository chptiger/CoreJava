package Concept;

/* overloading happens in compile time
 * Yes:
1.) The number of parameters is different for the methods.
2.) The parameter types are different (like changing a parameter that was a float to an int). 

No:
1.  Just changing the return type of the method.  If the return type of the method is the only thing changed, then this will result in a compiler error.  
2.  Changing just the name of the method parameters, but not changing the parameter types.  If the name of the method parameter is the only thing changed then this 
     will also result in a compiler error.
 */
public class Overload {
	public static void main(String[] args) {

	}

	class A {
		void sayHello() {
			System.out.println("Hello A");
		}

		String a = "cat";

		void sayHello(String a) {
			System.out.println(" Hello " + a);
		}
	}
}
