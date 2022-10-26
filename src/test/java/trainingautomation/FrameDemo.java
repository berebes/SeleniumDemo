package trainingautomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	String url="https://www.testautomationpractice.blogspot.com";
	
	WebDriver driver;
	
	
	
	
	@Test
	public void frameTest() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get(url);
		
		
		
		
		
		
	}
	
	
	
	
}
