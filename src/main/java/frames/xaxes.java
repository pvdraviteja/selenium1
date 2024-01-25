package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xaxes {

	public static void main(String[] args) throws Throwable {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		
//		driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[1]")).sendKeys("following-sibling");
//		
//		driver.findElement(By.xpath("//label[text()='Email']/preceding-sibling::input[1]")).sendKeys("preceding-sibling");
//		
//		driver.findElement(By.xpath("//div[@class='container']/child::input[1]")).sendKeys("child");
//		
//  	Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@type='submit']/parent::div/button[2]")).click();
		
		driver.findElement(By.xpath("//div[@class='container']/descendant::div[2]/input")).sendKeys("Decendant");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='buttons']/ancestor-or-self::div[1]/button[3]")).click();
		
		
	}

}
