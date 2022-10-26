package trainingautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeAutomation {

	
	  String url="https://www.dummyticket.com/dummy-ticket-for-visa-application/";
	
	WebDriver driver;
	
	
	
	@Test
	public void dropdownTest() {
		
		
		
        WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get(url);
		
		
		//driver.findElement(By.id("//span[@id='select2-reasondummy-container']")).
		
		
		driver.findElement(By.id("deliverymethod_2")).click();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
