package logicalProgram;

public class FrequencyofAlphabet {

	public static void main(String[] args) {
		   int counter=0;
		   String str="I Love My Country";
		   char frequency='y';
		   
		   for(int i=0;i<=str.length()-1;i++)
		   {
			 if(frequency==str.charAt(i));
			 {
			  counter++;
			 }
			 System.out.println("Frequency of "+frequency+" = "+counter);

		   }
		   

	}

}
