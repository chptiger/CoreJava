package innerClass;

public class StaticInnerClass {
	static int data = 30;

	static class inner {
		void msg() {
			System.out.println("this is inner static class");
		}

		static void msg2() {
			System.out.println("this is static method inside the inner static class");
		}
	}

	public static void main(String[] args) {
		StaticInnerClass.inner innerTest = new StaticInnerClass.inner();
		innerTest.msg();

		StaticInnerClass.inner.msg2();
	}
}
