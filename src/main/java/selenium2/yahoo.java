package selenium2;


import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo {

	public static void main(String[] args) throws Throwable {

		WebDriver driver  = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.manage().window().maximize();
		driver.findElement(By.id("login-username")).sendKeys("sampath.kanaala@yahoomail.com");
//		driver.findElement(By.name("signin")).click();
//    	driver.findElement(By.linkText("Forgotten username?")).click();
//		driver.findElement(By.partialLinkText("Forgotten us")).click();
		
//	    java.util.List<WebElement> we=driver.findElements(By.tagName("input"));
//		System.out.println(we.size());
		
//		Thread.sleep(3000);
//		driver.findElement(By.cssSelector("label[for=persistent]")).click();
//		
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"mbr-forgot-link\"]")).click();
		
	//	driver.findElement(By.xpath(""))
		
		
		
	}

}
