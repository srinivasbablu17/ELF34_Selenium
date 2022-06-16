package TestNG;

import org.testng.annotations.Test;

public class testngusingxmlfile {
	
	@Test (groups = "smoke")
	public void food(){
		System.out.println("Biriyani");
		System.out.println("Pizzas");
		System.out.println("Burger");
		System.out.println("Panipuri");
	}
	
	@Test (groups = "smoke")
	public void movies(){
		System.out.println("Bahubali");
		System.out.println("RRR");
		System.out.println("sarkar");
		System.out.println("Charlie");
		
		
	}
	
	@Test (groups = "regression")
	public void companies(){
		
		System.out.println("Wipro");
		System.out.println("Infosys");
		System.out.println("Accenture");
		System.out.println("testyantra");
		
	}
	
	@Test (groups = "regression")
	public void area(){
		System.out.println("JP nagar");
		System.out.println("Banashankari");
		System.out.println("Laggere");
		System.out.println("yeswanthapur");
		
		
		
	}
	
	

}
