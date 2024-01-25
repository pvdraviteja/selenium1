package frames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xaxes1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		
//		int Rows =	driver.findElements(By.xpath("//table[@id='customers']//ancestor::tbody/tr")).size();
//		System.out.println("No of row in tables :" +Rows);
		
//		int coloumns =	driver.findElements(By.xpath("//table[@id='customers']//ancestor::tbody/tr/th[2]")).size();
//		System.out.println("No of row in tables :" +coloumns);

		List<WebElement> value = driver.findElements(By.xpath("//tr[@style='background-color:#ddd;box-sizing:inherit']//parent::tbody//td[1]"));
		System.out.println(value.size());
		
//		for(int i=0;i<value.size();i++) {
//			System.out.println(value.get(i).getText());
//		}

//		for(int i=0;i<value.size();i++) {
//			String str = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]//td")).getText();
//			if(str.equals("Centro comercial Moctezuma")) {
//				String s1 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]//td[2]")).getText();
//				String s2 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]//td[3]")).getText();
//				System.out.println(str+"- "+s1+"- "+s2);
//				break;
//			}
//		}
		
		for(int i=0;i<value.size();i++) {
			String str = driver.findElement(By.xpath("//td[@style='border:1px solid #ddd;box-sizing:inherit;padding:8px']//following-sibling::td[1]")).getText();
			if(str.equals("Contact")) {
				String s1 = driver.findElement(By.xpath("//td[@style='border:1px solid #ddd;box-sizing:inherit;padding:8px']//following-sibling::td[1]//span[1]")).getText();
//				String s2 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[3]//td[3]")).getText();
//				String s3 = driver.findElement(By.xpath("//table[@id='customers']//tbody//tr[4]//td[3]")).getText();
				
				System.out.println(str+"-"+s1);
				break;

			}}

		
	}

}
