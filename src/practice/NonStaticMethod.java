package practice;

public class NonStaticMethod {

	public void myMethod()
	{
		System.out.println("I am inside non static method");
	}
	public static void main(String[] args) {
	    NonStaticMethod obj = new NonStaticMethod ();
	    obj.myMethod();
	    
	}

}
