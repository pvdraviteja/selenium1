package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws Throwable {

		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.naukri.com/nlogin/login?");
		driver.manage().window().maximize();
        
		driver.findElement(By.id("usernameField")).sendKeys("pvdraviteja88@gmail.com");
	    driver.findElement(By.id("passwordField")).sendKeys("ravipvd8");
	    driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/div[3]/div/button[1]")).click();
        Thread.sleep(3000);
        
	    driver.findElement(By.xpath("//div[@class='nI-gNb-drawer__icon']")).click();
        Thread.sleep(3000);
	    driver.findElement(By.className("nI-gNb-info__sub-link")).click();
	    Thread.sleep(3000);
	    
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,77)");
		Thread.sleep(3000);

	    driver.findElement(By.xpath("//*[@id=\"lazyAttachCV\"]/div/div[2]/div[2]/div/div")).click();
	//    Thread.sleep(3000);
	    
	    
        
	}

}
