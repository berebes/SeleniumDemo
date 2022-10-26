package trainingautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptClickDemo {

	
	

	 String url="https://testautomationpractice.blogspot.com/";
		
		
		
		@Test
		public void JSExecutorClickTest()  {
			
			
			 WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
				driver.get(url);
			
				JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	
	   driver.switchTo().frame(0);
	   
	      WebElement jsElem =driver.findElement(By.xpath("//input[@id='RESULT_RadioButton-7_0']"));
	
	js.executeScript("arguments[0].click();", jsElem);
	
	
	
}
}