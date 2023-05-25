package logicalProgram;

public class Check4PrimeNo  {

	public static void main(String[] args) {
	
		int a= 7;
		int temp=0;
		
		for(int i=2; i<a-1; i++);
		{
			if (a%2==0)
			{
				temp=1;
			}
			if (temp==0)
			{
				System.out.println(a+"= is a prime number");
			}
			else
			{
				System.out.println(a+"= is Not a prime number");
			}
		}

	}

}
