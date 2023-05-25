package Control_statement;

public class NestedIf3 {

	public static void main(String[] args) {

		System.out.println("Welcome to Blood donation camp");
		int age=14;
	    int weight=45;
		
		if(age<=19)
		{
			System.out.println("condition 1 satisfied");
		
		if(weight<=50)
		{
				System.out.println("condition 2 satisfied");
				System.out.println("You are elegible to donate blood");
	}
		else
		{
			System.out.println("You age is not valid to donate blood");
		}
		}

	}

}
