package terminology.keyword.final_;

import org.junit.Test;

public class FinalTest {

	@Test
	public void test_Final() {
		final StringBuilder input = new StringBuilder("final testing");
		System.out.println(input.toString());
		input.append("update the final modified value, but not update the reference of input");
		System.out.println(input.toString());
		
//		input = new StringBuilder("");
		System.out.println("final modified variable could update the reference");
	}
}
