package Frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrw {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void launch(String browsername) {
		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
			
			
		}
		else if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			driver =new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("name")).sendKeys("9177991485");
	}
	

}
