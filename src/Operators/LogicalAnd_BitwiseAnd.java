package Operators;

public class LogicalAnd_BitwiseAnd {

	public static void main(String[] args) {
		// Logical And
		
		int a= 10;
		int b= 5;
		int c= 20;
		
		System.out.println(a<b && a++<c);
		System.out.println(a);
		
		System.out.println("-------");
		// Bitwise And
		
		System.out.println(a++<c & b<a);
		System.out.println(c);

	}

}
