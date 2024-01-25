package selenium2;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Netlify {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://trytestingthis.netlify.app/");
		java.util.List<WebElement> we=driver.findElements(By.xpath("//input[@id='moption'and contains(@id,mopt)]"));
		System.out.println(we.size());
    	for(int i=0;i<=we.size();i++) {
    	if(i!=1)
        
					we.get(i).click();
			
		}
//		for (WebElement el : we) {
//			String s1= el.getAttribute("name");
//			System.out.println(s1);
//			if(s1.equals("option1")||(s1.equals("option3"))) {
//				el.click();
//	}

//	}
	
	}
	}
