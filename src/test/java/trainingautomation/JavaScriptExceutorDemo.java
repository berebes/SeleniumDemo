package trainingautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExceutorDemo {

	
	
	
	 String url="https://www.countries-ofthe-world.com/flags-of-the-world.html";
		
		
		
		@Test
		public void JSExecutorTest() throws InterruptedException {
			
			
			 WebDriverManager.chromedriver().setup();
				
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				
				driver.get(url);
			
				JavascriptExecutor js = (JavascriptExecutor)driver;
		
				//1. Scroll down page by Pixel
				
	  // js.executeScript("window.scrollBy(0,3000)", " ");
	
	
	
	
	   //System.out.println(js.executeScript("return window.pageYOffset;"));
	
	
	  
	  //2. Scroll down page till the element is visible
	  
	  
	   // WebElement eriFlag = driver.findElement(By.xpath("//img[@alt='Flag of Eritrea']"));
	    
	   // js.executeScript("arguments[0].scrollIntoView();",eriFlag );
	  
	  
	  
	  //3. End of the Page
	    
	    
	    js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  
	    System.out.println(js.executeScript("return window.pageYOffset;"));
	  
	   Thread.sleep(5000);
	    
	    // Go back to  initial position 
	    
	    js.executeScript("window.scrollBy(0, -document.body.scrollHeight)");
	    
	    
	
	
		}}
