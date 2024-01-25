package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframes {

	/**
	 * @param args
	 * @throws Throwable
	 */
	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		
		driver.switchTo().frame("frm1");
		Thread.sleep(3000);
    	driver.findElement(By.id("selectnav2")).click();

		
//		driver.switchTo().frame("frm2");
//		Thread.sleep(3000);
//    	driver.findElement(By.id("firstName")).sendKeys("ravi");
//    	driver.switchTo().defaultContent();
    	
//		driver.switchTo().frame("hya");
//		Thread.sleep(3000);
//    	driver.findElement(By.id("firstName")).sendKeys("teja");
//    	
//		driver.switchTo().frame("hya");
//		Thread.sleep(3000);
//    	driver.findElement(By.id("firstName")).sendKeys("teja");
//
//    	driver.switchTo().parentFrame();

//		driver.switchTo().frame("frm3");
//		Thread.sleep(3000);
//    	driver.findElement(By.id("selectnav2")).click();

    	
		
		
	}

}
