package Control_statement;

public class EvenOdd_InLoop {

	public static void main(String[] args) {
		System.out.println("Even \t Odd");
		for(int i=1; i<=10; i++)
		{
			if(i % 2==0) {
				System.out.println(i);
			}
			else {
				System.out.println("\t"+i);
			}	
		}
	}

}
