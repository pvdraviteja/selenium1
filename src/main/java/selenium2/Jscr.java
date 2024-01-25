package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jscr {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	    driver.get("https://login.yahoo.com/?");
	WebElement we = driver.findElement(By.id("login-username"));
	    
	    JavascriptExecutor js =(JavascriptExecutor)driver;
	    js.executeScript("arguments[0].value ='pvdraviteja88@gmail.com'" ,we);	
	}

}
