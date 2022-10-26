package trainingautomation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datepicker {

	
	String url="https://www.jqueryui.com/datepicker/";
	
	WebDriver  driver;
	
	@Test
	public void DatepickerTest() {
		
		
		 WebDriverManager.chromedriver().setup();
			
			driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			driver.get(url);
		
		
			
			driver.switchTo().frame(0);
		
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("02/15/2022");
		
			
			
			String month ="May";
			String year  ="2020";
			String date  ="12";
			
			
			
			
			driver.findElement(By.xpath("//input[@id='datepicker']")).click();
			
			
			
			
			while(true)
			
			
			{
				
				
				String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
				
				String yr=	driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				
				if(mon.equals(month)  && yr.equals(year)) {
					
					
					break;
					
				}
				
				
				
				//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				
				
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				
				
			}
			
			
			// Date
			
			
			
			 List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
			
			 
			 
			 for(WebElement dt:allDates) {
				 
				 
				 if(dt.getText().equals(date)) {
					 
					 
					 
					 dt.click();
				 }
				 
				 
			 }
			
		
	}
	
	
	
	
	
}
