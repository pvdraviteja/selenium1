package Frameworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prog {

	WebDriver driver;
	
	@Test(priority=1)
	public void Hrm() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://marolixhr.com/login");
		
	}
	
	@Test(priority=2)
	public void title()  {
		System.out.println(driver.getTitle());
		
	}
	@Test(priority=3)
	public void url() {
	System.out.println(driver.getCurrentUrl());	
	
	}
	@Test(priority=4)
	public void ab() {
	
		System.out.println("Method 4");
	}
	
//	@Test
//	public void exit() {
//		//driver.close();
//	}
}
