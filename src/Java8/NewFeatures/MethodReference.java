package Java8.NewFeatures;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * Method references help to point to methods by their names. A method reference
 * is described using "::" symbol. A method reference can be used to point the
 * following types of methods −
 * 
 * Static methods Instance methods Constructors using new operator
 * (TreeSet::new)
 * 
 * @author thomas
 *
 */
public class MethodReference {

	@Test
	public void test_MethodReference() {

		List names = new ArrayList();

		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");

		names.forEach(System.out::println);
	}
}
