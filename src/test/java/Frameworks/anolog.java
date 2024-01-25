package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class anolog {

	WebDriver driver;
	
	@AfterMethod
	void exit() {
		driver.close();
	}
	
	@Test
	public void home() throws Throwable {
		
		driver.findElement(By.xpath("//input[@placeholder='From Station']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@placeholder='To Station']")).sendKeys("Rajamundry");
        Thread.sleep(2000);	
	}
	
	@Test
	void tikt() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Track Ticket']")).click();
        Thread.sleep(2000);	

	}
	
	@Test
	void off() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Track Ticket']")).click();
        Thread.sleep(2000);	

	}
	
	@BeforeMethod
	void launch() {
		 driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
	}
	
}
