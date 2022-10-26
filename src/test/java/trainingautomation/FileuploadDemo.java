package trainingautomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileuploadDemo {

	
	String url="https://www.monsterindia.com/";
	
	
	
	@Test
	public void FileuploadTest()  {
		
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			
			driver.get(url);
		
	driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
	
	
	driver.findElement(By.xpath("//input[@name='file'][1]")).sendKeys("C:\\Users\\berek\\Downloads\\UpdatedResume.pdf");
	
	
	
	
	
	
	
	
	
}}
