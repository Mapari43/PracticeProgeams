package practice;

public class MCWC {

	public static void fun1()
	{
		System.out.println("I am inside static method");
	}
	
	public void fun2()
	{
		System.out.println("I am inside non-static method");
	}
	public static void main(String[] args) {
		MCWC.fun1();
		
		MCWC f= new MCWC();
		f.fun2();
		
				
		

	}

}
