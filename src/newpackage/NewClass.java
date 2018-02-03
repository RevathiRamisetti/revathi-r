package newpackage;

import org.junit.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewClass {
	@BeforeSuite
	public void m1(){
		System.out.println("1");
	}
	@BeforeTest
	public void m2(){
		System.out.println("2");
	}
	@BeforeClass
	public void m3(){
		System.out.println("3");
	}
	@BeforeMethod
	public void m4(){
		System.out.println("4");
	}
	
	@Test
	public void m5(){
		System.out.println("5");
	}
	
	
	@Test
	public void m6(){
		System.out.println("6");
	}
	@AfterMethod
	public void m7(){
		System.out.println("7");
	}
	@AfterClass
	public void m8(){
		System.out.println("8");
	}
	@AfterTest
	public void m9(){
		System.out.println("9");
	}
	
	@AfterSuite
	public void m10(){
		System.out.println("10");
	}
	
	
}
