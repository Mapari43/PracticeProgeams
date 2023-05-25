package practice;

public class global_veriable {

	int a= 45;
	int b =60;
	
	public void addition()
	{
		int c= a+b ;
		System.out.println(c);
	}
	
	public void subtraction()
	{
		int d= b-a ;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		global_veriable m = new global_veriable();
				m.addition();
				m.subtraction();
		

	}

}
