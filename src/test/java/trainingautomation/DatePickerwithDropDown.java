package trainingautomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerwithDropDown {

	
	
       String url="https://www.dummyticket.com/dummy-ticket-for-visa-application/";
	
	WebDriver  driver;
	
	@Test
	public void DatepickerDrpDwnTest() {
		
		
		 WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			driver.get(url);
		
	
	//driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("15/02/1985"); Thos will not work
	
			
			// Logic
			String month="Jan";
			String year="1970";
			String date="11";
			
			
			
			driver.findElement(By.xpath("//input[@id='dob']")).click(); // opens the date picker
			
			
			// Month Selection
			
			
	 Select drpMonth = new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']")));
			
			drpMonth.selectByVisibleText(month);
			
			
			// Year Selection
			
			Select drpYear = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
			
			
			
			
			drpYear.selectByVisibleText(year);
			
			
			// Date Selection
			
List<WebElement> allDates= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
			
			for(WebElement dt:allDates) {
				
				
				if(dt.getText().equals(date))
				{
					
					dt.click();
					break;
				}
			}
	
	
} }
