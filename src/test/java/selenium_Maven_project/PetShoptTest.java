package selenium_Maven_project;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PetShoptTest {
	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); // Instantiate a ChromeDriver class

        driver.manage().window().maximize();	 // Maximize the browser
         driver.get("https://petstore.octoperf.com/actions/Catalog.action");
       //  driver.findElement(By.className("searchProducts")).click(); //not worked only 1
     //   driver.findElement(By.cssSelector("input[class='searchProducts']")).click();//not work
     // driver.findElement(By.xpath("//input[@class='searchProducts']")).click(); //not worked
         
         
      //   driver.findElement(By.linkText("Sign In")).click(); // worked 
         
       //  Thread.sleep(4000); // connection reset error
       //  driver.close();
         
         
         // how to navigate back and forth 
         //line 25
         //if match more than 1 wt to do
         //how to navigate to next page
      //link open to next page how to navigate
        //class notes // means skip the intermidiate level in xpath
         driver.close();
         
    	

}
}
