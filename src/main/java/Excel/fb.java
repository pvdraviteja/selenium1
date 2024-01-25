package Excel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb {

		
		
		   @Test(dataProvider ="data",dataProviderClass = fbdd.class)
			
			public void ab(String Username, CharSequence[] Password) throws Throwable {
				
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com/");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.findElement(By.id("email")).sendKeys(Username);
				driver.findElement(By.id("pass")).sendKeys(Password);
				Thread.sleep(2000);
				driver.findElement(By.name("login")).click();

		}
		

}
