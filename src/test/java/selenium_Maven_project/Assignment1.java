package selenium_Maven_project;

import java.net.SocketException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	
	 

			public static void main(String[] args) throws InterruptedException
			{
			WebDriver driver = new ChromeDriver();//runtime polymorphism
				driver.get("https://tutorialsninja.com/demo/index.php");
				driver.manage().window().maximize();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//i[@class='fa fa-caret-down']")).click();
				driver.findElement(By.xpath("//button[text()='$US Dollar']")).click();
				driver.findElement(By.linkText("Cameras")).click();
				JavascriptExecutor j = (JavascriptExecutor) driver;
		         j.executeScript("window.scrollBy(0,500)");
				driver.findElement(By.linkText("Canon EOS 5D")).click();
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
		         js.executeScript("window.scrollBy(0,500)");
				
				driver.findElement(By.xpath("//button[@id='button-cart']")).click();
				Thread.sleep(2000);
				System.out.println("*******************");
				System.out.println("Error message  : + Select Required");
				JavascriptExecutor je = (JavascriptExecutor) driver;
		         je.executeScript("window.scrollBy(0,-500)");
			
				driver.findElement(By.xpath("//i[@class='fa fa-home']")).click();
				
				
			
				driver.findElement(By.xpath("//a[normalize-space()='iPhone']")).click();// doubt
				Thread.sleep(1000);
				JavascriptExecutor jp = (JavascriptExecutor) driver;
		         jp.executeScript("window.scrollBy(0,500)");
			driver.findElement(By.xpath("//input[@id='input-quantity']")).clear();
			 Thread.sleep(1000);
			 JavascriptExecutor jx = (JavascriptExecutor) driver;
	         jx.executeScript("window.scrollBy(0,500)");
			 driver.findElement(By.xpath("//input[@size='2']")).sendKeys("2");
			 Thread.sleep(2000);				
	driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block']")).click();
			
		
			System.out.println("iphone with quantity 2 added into cart");
			JavascriptExecutor ja = (JavascriptExecutor) driver;
	         ja.executeScript("window.scrollBy(0,-500)");
	       Thread.sleep(1000);

			driver.findElement(By.xpath("//a[@title='Shopping Cart']//i")).click();
			//Thread.sleep(1000);
			System.out.println(" small black cart click happened");
			driver.findElement(By.xpath("//span[@id='cart-total']")).click();
			driver.findElement(By.linkText("View Cart")).click();
			System.out.println("*******************");
			System.out.println("clicked on view cart is succesful");
			System.out.println("***********");
			//driver.close and quit both giving connection reset error
			
			
			//unable to create WebElement update
			//Type mismatch: cannot convert from void to WebElement eeror 
		WebElement update=	driver.findElement(By.xpath("//input[@size='1'] "));
	
			update.click();
			update.clear();
			update.sendKeys("3");
			
			driver.findElement(By.xpath("//i[@class='fa fa-refresh']")).click();
			System.out.println("****************");
			System.out.println("Success: You have modified your shopping cart!");
			System.out.println("**********");
			JavascriptExecutor jk = (JavascriptExecutor) driver;
	         jk.executeScript("window.scrollBy(0,500)");
		//	String tax=driver.findElement(By.xpath("//strong[text()='Eco Tax (-2.00):'] ")).getText();
		 //  System.out.println(tax);
  List<WebElement> allRows = driver.findElements(By.xpath("//p[@class='text-right']//..//tbody")); 

		// And iterate over them and get all the cells 
		for (WebElement row :allRows) {
		    List<WebElement> cells = row.findElements(By.tagName("td")); 
		//    List<WebElement> cells1 = row.findElements(By.tagName("td[3]"));

		    // Print the contents of each cell
		    for (WebElement cell : cells) {         

		    System.out.println(cell.getText());
		    //Or try below code 
		    //System.out.println(cell.getAttribute("innerHTML"));
		    
		}
			
			
			
		}		
			
			}

		

}
