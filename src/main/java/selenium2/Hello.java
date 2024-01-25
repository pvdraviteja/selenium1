package selenium2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hello {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Thread.sleep(15000);
		WebDriverWait we=new WebDriverWait(driver,Duration.ofSeconds(5));
		
	WebElement e=driver.findElement(By.id("populate-text"));
	e.click();
	 WebElement wa=we.until(ExpectedConditions.visibilityOfElementLocated(By.id("h2")));
	 WebElement wb=driver.findElement(By.id("h2"));
	 System.out.println(e.isDisplayed());
		
	}

}
