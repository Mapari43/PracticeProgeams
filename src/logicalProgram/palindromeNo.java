package logicalProgram;

public class palindromeNo {

	public static void main(String[] args) {
		int num=121;
		int temp;
		int rev=0;
		int pal= num;

		while(num>0)
		{
		 temp=num%10;
		 rev=rev*10+temp;
		 num=num/10;
		}
		System.out.println(rev);

		if(rev==pal)
		{
		System.out.println(rev+ "is a palandrome number");
		}

		else
		{
		System.out.println(rev+ "is not a palandrome number");
		}

	}

}
