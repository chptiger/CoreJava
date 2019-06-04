package Concept;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 * it depends which way on the inheritance hierarchy it allows. 
 * Assume you have a class "Child" which inherits from "Parent" which inherits from "Grandparent".

<T extends Parent> accepts either Parent or Child while <T super Parent> accepts either Parent or Grandparent.

List<? extends Number> foo3 = new ArrayList<Number>();  // Number "extends" Number (in this context)
List<? extends Number> foo3 = new ArrayList<Integer>(); // Integer extends Number
List<? extends Number> foo3 = new ArrayList<Double>();  // Double extends Number
 * 
 */
public class Generics {
	public static void main(String[] args) {
		List<? extends Serializable> l1 = new ArrayList<String>();// String "extends" Serializable
		List<? extends Serializable> l2 = new ArrayList<>();
		List<? extends Serializable> l4 = new ArrayList();

	}
}
