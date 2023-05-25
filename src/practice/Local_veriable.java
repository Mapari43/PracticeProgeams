package practice;

public class Local_veriable {

	public void local1()
	{
		int a=50;
		System.out.println(a);
	}
	
	public static void local2()
	{
		int b =100;
		System.out.println(b);
	}
	
	public static void main(String[] args) {
	
		Local_veriable m = new Local_veriable();
		m.local1();
		
		local2();
		
	}

}
