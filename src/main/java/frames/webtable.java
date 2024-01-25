package frames;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.AddHasCasting;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(Duration.ofDays(10));
//	int Rows =	driver.findElements(By.xpath("//table[@id='customers']//tbody/tr")).size();
//	System.out.println("No of row in tables :" +Rows);
	
//	int coloumns =	driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th")).size();
//	System.out.println("No of row in tables :" +coloumns);
	
	List<WebElement> value = driver.findElements(By.xpath("//table[@id='customers']//tbody//td"));
	System.out.println(value.size());
	
	for(int i=0;i<value.size();i++) {
		System.out.println(value.get(i).getText());
	}

//	for(int i=0;i<value.size();i++) {
//		String str = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]//td")).getText();
//		if(str.equals("Centro comercial Moctezuma")) {
//			String s1 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]//td[2]")).getText();
//			String s2 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]//td[3]")).getText();
//			System.out.println(str+"- "+s1+"- "+s2);
//			break;
//		}
//	}
	
//	for(int i=0;i<value.size();i++) {
//		String str = driver.findElement(By.xpath("//table[@id='customers']//tbody//th[3]")).getText();
//		if(str.equals("Country")) {
//			String s1 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[2]//td[3]")).getText();
//			String s2 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]//td[3]")).getText();
//			String s3 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[4]//td[3]")).getText();
//			
//			System.out.println(str+"-  "+s1+"-  "+s2+"-  "+s3);
//			break;
//
//		}}
	}

}
