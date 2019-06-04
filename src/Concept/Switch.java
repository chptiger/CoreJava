package Concept;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "abc";
		switch (key) {
		case "abc":
			System.out.println(1);
			break;
		case "xyz":
			System.out.println(2);
			break;
		default:
			System.out.println(3);
			break;
		}

		int value = 1;
		// long type can not used by swtich, change to int.
		switch (value) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println(3);
			break;
		}
	}

}
