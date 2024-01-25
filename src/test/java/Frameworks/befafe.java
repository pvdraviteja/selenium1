package Frameworks;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class befafe {

	@BeforeClass
	  public void bc() {
			System.out.println("Method 3");
		}
	
	  @BeforeSuite
		public void bs() {
			System.out.println("Method 1");
		}
	  
	  @BeforeTest
	  public void bt() {
			System.out.println("Method 2");
		}
	  
	 
	  
	  @BeforeMethod
	  public void bm() {
			System.out.println("Method 4");
		}
	  
	  @AfterTest
	  public void at() {
			System.out.println("Method 7");
		}
	 
	  
	  @Test(invocationCount=7)
	  public void test() {
			System.out.println("Test ");
		}
	  
	  @AfterMethod
	  public void am() {
			System.out.println("Method 5");
		}
	  
	  @AfterClass
	  public void ac() {
			System.out.println("Method 6");
		}
	  
	 
	  @AfterSuite
	  public void as() {
			System.out.println("Method 8");
		}

}
