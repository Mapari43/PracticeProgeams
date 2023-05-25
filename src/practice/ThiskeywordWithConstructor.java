package practice;

public class ThiskeywordWithConstructor {

	int a;
	
	public void display()
	{
		System.out.println(a);
		
	}
	
	ThiskeywordWithConstructor(int a)
 {
	 System.out.println(a);
	 this.a=a;
 }
	
	public static void main(String[] args) {
		ThiskeywordWithConstructor m = new ThiskeywordWithConstructor(30);
		m.display();
		

	}

}
