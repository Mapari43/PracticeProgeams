package Single_level_Inheritence;

public class Son extends Father  {
	
	public void job()
	{
		System.out.println("Son has job");
	}
	
	public void bike()
	{
		System.out.println("Son has bike");
	}

	public static void main(String[] args) {
           Son s=new Son();
            s.farm();
            s.house();
            s.bike();
            s.job();

	}

}
