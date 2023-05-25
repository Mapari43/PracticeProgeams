package practice;

public class StaticMethod {

	public static void mymethod()
	{
	System.out.println("I an inside static method");
	}
	
	public static void main(String[] args) {
	      StaticMethod.mymethod();
	      mymethod();
	}

}
