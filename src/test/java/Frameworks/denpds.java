package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class denpds {
	
	WebDriver driver;
	@Test
	public void launch() {
        driver = new ChromeDriver();
		driver.get("https://marolixhr.com/login");
		driver.findElement(By.id("email")).sendKeys("raviteja9.marolix@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ravipvd8");
		driver.findElement(By.id("login_button")).click();
		
		String url = driver.getTitle();
		Assert.assertEquals(url, "Marolix HRMS - Dashboard");
		
	}
	@Test(dependsOnMethods="launch")
	public void logout() {
		
		driver.findElement(By.xpath("//span[@class='hide-mob ms-2']")).click();
		driver.findElement(By.xpath("//span[text()='Logout']")).click();
		
	}
	@Test
	public void exit() {
		
		driver.close();
	}
	
}
