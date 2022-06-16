package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class muitlidimensionalusinftestng {
	
	@Test(dataProvider="names")
	
	public void run(String Fn,String Ln,String Nn)
	{
		System.out.println(Fn);
       System.out.println(Ln);
		System.out.println(Nn);
		//System.out.println(Mm);	
       
	}
	
	@DataProvider (name="names")
	public Object[][] provider()
	{
		
	Object[][]  data=new Object[5][3];
	data[0][0] = "bablu";
	data[1][0]=  "bunty";
	data[2][0]= "putty";
	data[3][0]="pinky";
	data[1][1]="chitty";
	
	return data;
	
	
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
