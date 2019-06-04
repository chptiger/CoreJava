package Concept;

public class BitWiseOperator {
	public static void main(String[] args) {
		int a = 0B0;
		int b = 0B1;

		int z = a & b;
		System.out.format("%d", z); // 0
		System.out.println(" a " + a); // a 0
		System.out.println(" b " + b); // b 1

		long x = 0xCAFE_BABE;
		// long y = 0x_CAFE_BABE;
		long w = 0xC_A_F_E____BABE;

		// char c = 'a';
		// char d = 'b';
		// System.out.println(c - 'a');
		// System.out.println( 1 << (c - 'a'));
	}

	private static String method(String a) {
		// TODO Auto-generated method stub
		System.out.println(a);
		return a;
	}
}
