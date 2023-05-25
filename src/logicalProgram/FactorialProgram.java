package logicalProgram;

public class FactorialProgram {

	public static void main(String[] args) {
		
		int a= 5;
		int fact=1;
		
		for(int i=1; i<=a; i++) //1<=5...1<=4..1<=3...
		{
			fact=fact *i;
			// 1*1=1
            //	1*2=2
			// 2*3=6
			//6*4=24
			//24*5=12
			System.out.println(fact);
		}
        //  System.out.println(fact);
	}

}
