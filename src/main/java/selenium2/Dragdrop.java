package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws Throwable {

     WebDriver driver =new ChromeDriver();
     driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
     WebElement s =driver.findElement(By.id("box3"));
     WebElement r =driver.findElement(By.id("box103"));
     
     Actions ac =new Actions(driver);
     Thread.sleep(3000);
     
     ac.dragAndDrop(s,r).perform();
     Thread.sleep(3000);
     
     WebElement a = driver.findElement(By.id("box6"));
     WebElement b = driver.findElement(By.id("box106"));
     
     Actions as = new Actions(driver);
     
     as.dragAndDrop(a, b).perform();
     
	}

}
