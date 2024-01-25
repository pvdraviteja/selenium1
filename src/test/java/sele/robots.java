package sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robots {

	public static void main(String[] args) throws Throwable {

		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/merge_pdf");
		
		driver.findElement(By.xpath("//span[text()='Select PDF files']")).click();
		Robot r=new Robot();
		r.delay(3000);
		
		StringSelection s = new StringSelection("C:\\Users\\Admin\\MANUAL TSTING PRO 3.pdf");
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
