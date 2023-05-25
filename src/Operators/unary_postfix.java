package Operators;

public class unary_postfix {

	public static void main(String[] args) {
		//postfix  expr++
		
		int a= 10;
		System.out.println(a);  //10
		System.out.println(a++);  //10
		System.out.println(a++);  //11
		System.out.println(a);    //11
		
		System.out.println("---------");
		      //postfix  expr--
		
		int b=40;
		System.out.println(b);    //40
		System.out.println(b--);   //40
		System.out.println(b--);   //39
		System.out.println(b--);   //38
		  
	}

}
