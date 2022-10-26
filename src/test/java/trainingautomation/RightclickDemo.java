package trainingautomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightclickDemo {

	
	
	
     String url="https://www.swisnl.github.io/jQuery-contextMenu/demo.html";
	
	WebDriver driver;
	
	
	
	
	@Test
	public void RightClickTest() {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.get(url);
		
	
	
	
	
	
	
	
	
	
	}	
	
	
}
