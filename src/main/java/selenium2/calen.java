package selenium2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calen {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String User_month = "March";

		String User_year = "2025";

		String User_date = "1";

		driver.navigate().refresh();
		
		driver.findElement(By.id("first_date_picker")).click();

		
		
		while (true) {

			String Month_year = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();

			String[] MonyearSplit = Month_year.split(" ");

			String Month = MonyearSplit[0];
			String Year = MonyearSplit[1];
			
			if (Month.equals(User_month) && Year.equals(User_year)) {

				break;
			}

			else {

				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}

		}

		List<WebElement> dates = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));

		for (WebElement calenderdate : dates) {

			if (calenderdate.getText().equals(User_date)) {

				calenderdate.click();
			}

		}

	}

}
