package sele;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws Throwable {

		WebDriver driver  = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement we=	driver.findElement(By.xpath("//img[@alt='Hi Nanna']"));
		
	//	TakesScreenshot ts =(TakesScreenshot)driver;
		
//		File src =ts.getScreenshotAs(OutputType.FILE);
//		
//		File dcs = new File("./Screenshots/img2.png");
//		FileUtils.copyFile(src, dcs);
	
	File scr =we.getScreenshotAs(OutputType.FILE);
	File dcs = new File("./Screenshots/img1.png");
	FileUtils.copyFile(scr, dcs);
		
	}

}
