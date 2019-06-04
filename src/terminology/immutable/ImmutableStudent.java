package terminology.immutable;

/**
 * https://www.geeksforgeeks.org/create-immutable-class-java/
How to create Immutable class in java?
Immutable class means that once an object is created, we cannot change its content. In Java, all the wrapper classes (like String, Boolean, Byte, Short) and String class is immutable. We can create our own immutable class as well.

Following are the requirements:
• Class must be declared as final (So that child classes can’t be created)
• Data members in the class must be declared as final (So that we can’t change the value of it after object creation)
• A parameterized constructor
• Getter method for all the variables in it
• No setters(To not have option to change the value of the instance variable)
 */

public final class ImmutableStudent {
	final String name;
	final int age;
	
	public ImmutableStudent(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

class TestImmutableStudent {
	public static void main(String[] args) {
		ImmutableStudent student = new ImmutableStudent("immutable student", 99);
		System.out.println(student.getAge());
		System.out.println(student.getName());
		
//		uncommentling below line causes error
//		student.age = 89;
	}
}