package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jscr1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	    driver.get("https://selectorshub.com/xpath-practice-page/");
	    driver.findElement(By.xpath("//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img")).click();
	    
//	    JavascriptExecutor js =(JavascriptExecutor)driver;
//        js.executeScript("document.querySelector(\"[name='test']\").disabled=false");
//       driver.findElement(By.name("test")).sendKeys("Raviteja");
     
	      JavascriptExecutor je =(JavascriptExecutor)driver;
	      je.executeScript("document.querySelector(\"[name='test']\").disabled=false");
	      driver.findElement(By.name("test")).sendKeys("ravi");
        

	}

}
