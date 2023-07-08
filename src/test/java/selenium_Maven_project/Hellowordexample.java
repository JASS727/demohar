package selenium_Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;



public class Hellowordexample
{
	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver();
	}

	public static void ChromeDriver() throws InterruptedException 
	{
	System.setProperty("Webdriver.chrome.driver", "C:/Users/jass0/eclipse-workspace/Hello-word/src/test/resources/Driver/chromedriver.exe");
	String url=	"https://www.saucedemo.com/";
	
		
	    WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Instantiate a ChromeDriver class
        driver.manage().window().maximize();	 // Maximize the browser
       driver.get(url);
		System.out.println("title of web page is "+driver.getTitle());
		
		System.out.println("url is  "+driver.getCurrentUrl());
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
//	driver.close();  		//error while using 
	Thread.sleep(4000);
		
		driver.close();


	}
	static	
	{

		System.out.print("Wait please.....browser is going to start");
		}

}


