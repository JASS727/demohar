package selenium_Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDemoqa {

	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Instantiate a ChromeDriver class
		JavascriptExecutor js=(JavascriptExecutor)driver;
        driver.manage().window().maximize();	 // Maximize the browser
         driver.get("https://demoqa.com/books");
    	driver.findElement(By.id("login")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("jas123");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Agam@123456");
		Thread.sleep(5000);
		WebElement button= driver.findElement(By.id("login"));
		button.click();
		
		
		 js.executeScript("arguments[0].click();",button);
	//	driver.findElement(By.xpath("//[@id='login']")).click();
		//driver.findElement(By.id("login")).click();// did not work
}
}
