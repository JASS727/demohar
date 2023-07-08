package selenium_Maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoPracticeFormQA {
	public static void main(String[] args) throws Exception
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 

        driver.manage().window().maximize();
         driver.get("https://demoqa.com/automation-practice-form");
      
         driver.findElement(By.id("firstName")).sendKeys("jass");
         driver.findElement(By.id("lastName")).sendKeys("kaur");
         driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("jas123@gmail.com");//1/1 match
      //   select gender 
         JavascriptExecutor j = (JavascriptExecutor) driver;
         j.executeScript("window.scrollBy(0,500)");
         //select gender
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        //add phone number
         driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9875788888"); //1/1 match
        
      
       Thread.sleep(2000);
      
      WebElement subject= driver.findElement(By.id("subjectsInput"));
       Thread.sleep(1000);
       subject.click();
     subject.sendKeys("Maths");
    Thread.sleep(2000);
     subject.sendKeys(Keys.ARROW_DOWN);
      subject.click();
     Thread.sleep(2000);
      subject.sendKeys(Keys.ENTER);
        
 
  //hobbies
  driver.findElement(By.xpath("//label[text()='Sports']")).click();
   
    driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("5100 chippewa dr");
    

         //WebElement BtnSubmit = chromeDriver.findElement(By.id("submit"));
// new Actions(chromeDriver).scrollToElement(BtnSubmit).build().perform();
 //BtnSubmit.submit();

	
	}

	
	
	}
