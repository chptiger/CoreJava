package innerClass;

import org.junit.Test;

/**
 * This example defines three variables name x: the number variable of the class
 * ShadowTest the number variable of the inner class FirstLevel the parameter in
 * the method methodInFirstLevel
 * 
 * The variable x defined as a parameter of the method methodInFirstLevel shadow
 * the variable of the inner class FirstLevel. consequently, when you use the
 * variable x in the method methodInFirstLevel, it refers to the method
 * parameter.
 * 
 * To refer to the member of the inner class FirstLevel, sue the keyword this to
 * represent the enclosing scope.
 * 
 * @author xx65
 *
 */
public class ShadowTest {

	public int x = 0;

	class FirstLevel {// inner class
		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
		}
	}

	@Test
	public void test_shadow() {
		ShadowTest st = new ShadowTest();
		ShadowTest.FirstLevel fl = st.new FirstLevel();
		fl.methodInFirstLevel(23);
	}
}
