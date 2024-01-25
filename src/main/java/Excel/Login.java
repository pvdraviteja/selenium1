package Excel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://empirehome.myprojectsonline.co.in/");
		driver.manage().window().maximize();
	}

}
