package selenium2;

import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws Throwable {

		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("9177991485");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("ravipvd8");
//		driver.findElement(By.name("login")).click();
//		driver.findElement(By.linkText("Forgotten account?")).click();
//    	driver.findElement(By.partialLinkText("Forgotten")).click();
	    List<WebElement> we = driver.findElements(By.tagName("a"));
	    System.out.println(we.size());
		
	}
}
