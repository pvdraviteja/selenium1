package sele;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosel {

	public static void main(String[] args) throws Throwable {

		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("lenovo support");
     List<WebElement>list = driver.findElements(By.xpath("//*[@id=\"c7mM1c\"]/div[1]/span/b"));
    //    System.out.println(list.size());
        for (WebElement web1 : list) {
        	System.out.println(web1.getText());
        	if (web1.getText().contains("drivers")) {
        		
        		Thread.sleep(3000);
        		web1.click();
        		break;}
				
			}
			
		}
		
	}


