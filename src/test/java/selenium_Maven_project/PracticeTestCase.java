package selenium_Maven_project;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PracticeTestCase{
	
	
	
		public static void main(String[] args) throws InterruptedException
		{
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(); // Instantiate a ChromeDriver class
	        driver.manage().window().maximize();	 // Maximize the browser
	        driver.get("https://www.saucedemo.com/");
	        
			
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();  
			
			Thread.sleep(4000);
			
			System.out.println("test case pass");
			driver.quit();
		
		}
}
