package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class configurationannotation {
	
	
	@Test
	public void test()
	{
		System.out.println("Annotaion");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("beforesuite");
	}
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("Aftertest");
	}
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("beforeclass");
	}
	@AfterClass
	public void afterclass()
	{
		System.out.println("Afterclass");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("beforemethod");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("Aftersuite");
	}
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Beforetest");
	}
}
