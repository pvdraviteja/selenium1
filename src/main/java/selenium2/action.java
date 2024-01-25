package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();

		driver.get("https://login.yahoo.com/?");
		WebElement we =driver.findElement(By.id("login-username"));
		we.sendKeys("Raviteja");
		
		Actions ac = new Actions(driver);
		Thread.sleep(2000);
		//ac.contextClick().perform();
		
		ac.doubleClick(we).perform();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,77)");
	}

}
