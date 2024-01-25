package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Netlifyapp {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
	//	WebElement wc=driver.findElement(By.id("male"));
	//	System.out.println("Element is Displayed :"+wc.isDisplayed());
	//	System.out.println("Element is Displayed :"+wc.isEnabled());
//		wc.click();
//		System.out.println("Element is Displayed :"+wc.isSelected());
		WebElement wc=driver.findElement(By.id("male"));
		WebElement wf=driver.findElement(By.id("female"));
		WebElement wo=driver.findElement(By.id("other"));
		wo.click();
		System.out.println("male is selected : "+wc.isSelected());
		System.out.println("female is selected : "+wf.isSelected());
		System.out.println("other is selected : "+wo.isSelected());
		
		
		
		
	
	}

}
