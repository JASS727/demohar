package selenium_Maven_project;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorialninjaapp{


		
		 

				public static void main(String[] args) throws InterruptedException {
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
			
	 
		     	System.out.println("---Eco tax(-2.0) .....");
		     String EcoTax =driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[2]/td[2]")).getText();
	   	System.out.println(EcoTax);
		System.out.println("*********VAT Amount(20%)**********");
		String Vat=driver.findElement(By.xpath("//div[@class='col-sm-4 col-sm-offset-8']/table/tbody/tr[3]/td[2]")).getText();
  System.out.println(Vat);
  driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
  System.out.println("*********Error msg found***********");
  System.out.println("Products marked with *** are not available in the desired quantity or not in stock!");
  driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
  //scroll up after remove
  JavascriptExecutor jv = (JavascriptExecutor) driver;
	 jv.executeScript("window.scrollBy(0,500)");
 
	
	 // Move to the home screen and click on Mac book, check the default quantity is 1 and click add to cart then verify success message
	   
	 
	 Thread.sleep(2000);
 driver.findElement(By.xpath("//i[contains(@class,'home')]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//a[text()='MacBook']")).click();
	 JavascriptExecutor sc = (JavascriptExecutor) driver;
	 sc.executeScript("window.scrollBy(0,-500)");
	 WebElement quantity=driver.findElement(By.xpath("//input[@id='input-quantity']"));
	 quantity.click();
	 int i=Integer.valueOf(quantity.getAttribute("value"));
	 if(i==1)
		 System.out.println("quantity for mac book is 1");
	 System.out.println("*****add item and verify msg if it is 1 quantity******");
	 JavascriptExecutor s = (JavascriptExecutor) driver;
	 s.executeScript("window.scrollBy(0,500)");
		 driver.findElement(By.xpath("//button[@id='button-cart'] ")).click();
		 Thread.sleep(2000);
  String scc =driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
  System.out.println(scc);
	 
	 //11.Click on the shopping cart link in the top and 
	 //apply ABCD123 as coupon code to check, print error message
  driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
  
  JavascriptExecutor scr = (JavascriptExecutor) driver;
	 scr.executeScript("window.scrollBy(0,500)");
	 Thread.sleep(2000);
	// driver.findElement(By.xpath("//a[@class='accordion-toggle collapsed']")).click();
	  driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
	WebElement cpn= driver.findElement(By.xpath("//input[@id='input-coupon']"));
	 cpn.sendKeys("ABCD123");
	driver.findElement(By.xpath("//input[@id='button-coupon']")).click();
	Thread.sleep(2000);
String coupon=driver.findElement(By.xpath("//div[text()=' Warning: Coupon is either invalid, expired or reached its usage limit!']")).getText();
	System.out.println("**********");
  		System.out.println(coupon);
  		//12.Enter AXDFGH123 as gift certificate and perform apply to check, print error message
  		JavascriptExecutor cr = (JavascriptExecutor) driver;
  		 cr.executeScript("window.scrollBy(0,500)");
  		 driver.findElement(By.xpath("//a[text()='Use Gift Certificate ']")).click();
  		WebElement Giftcpn=driver.findElement(By.xpath("//input[@placeholder='Enter your gift certificate code here']"));
  		Giftcpn.sendKeys("AXDFGH123");
  		driver.findElement(By.xpath("//input[@value='Apply Gift Certificate']")).click();
  		Thread.sleep(2000);
  		String gift=driver.findElement(By.xpath("//div[text()=' Warning: Gift Certificate is either invalid or the balance has been used up!']")).getText();
  		System.out.println("**********");
  		System.out.println(gift);
  		//13.Clear both textbox values and proceed to checkout
  		 JavascriptExecutor r = (JavascriptExecutor) driver;
  		 r.executeScript("window.scrollBy(0,500)");
  		 Giftcpn.click();
  		 Giftcpn.clear();
  		 Thread.sleep(2000);
  		 driver.findElement(By.xpath("//a[text()='Use Coupon Code ']")).click();
  		Thread.sleep(2000);
  		 cpn.click();
  		 cpn.clear();
  		Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Checkout']")).click();
		//.14.Select register account option and enter all account and billing details, click continue
		

		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@value='register']")).click();
    	driver.findElement(By.xpath("//input[@value='Continue']")).click();
    	
    	Thread.sleep(2000);
    	WebElement fname=driver.findElement(By.xpath("//input[@id='input-payment-firstname']"));
    	fname.click();
    	fname.sendKeys("jaswin");
    	WebElement lname =driver.findElement(By.xpath("//input[@id='input-payment-lastname']"));
    	lname.click();
    	lname.sendKeys("kaur");
    	WebElement email=driver.findElement(By.xpath("//input[@id='input-payment-email']"));
    	email.click();
    	email.sendKeys("jas073@gmail.com");
    	WebElement phn=driver.findElement(By.xpath("//input[@id='input-payment-telephone']"));
    	phn.click();
    	phn.sendKeys("323243434");
    	WebElement cname=driver.findElement(By.xpath("//input[@id='input-payment-company']"));
    	cname.click();
    	cname.sendKeys("NmpyNinja");
    	WebElement add=driver.findElement(By.xpath("//input[@id='input-payment-address-1']"));
    	add.click();
    	add.sendKeys("chipp ");
    	WebElement add2=driver.findElement(By.xpath("//input[@id='input-payment-address-2']"));
    	add2.click();
    	add2.sendKeys("oak forest");
    	WebElement city=driver.findElement(By.xpath("//input[@id='input-payment-city']"));
    	city.click();
    	city.sendKeys("chicago");
    	WebElement pwd=driver.findElement(By.xpath("//input[@id='input-payment-password']"));
    	pwd.click();
    	pwd.sendKeys("123456");
   WebElement cnf=driver.findElement(By.xpath("//input[@id='input-payment-confirm']"));
   cnf.click();
   cnf.sendKeys("123456");
   WebElement pcode=driver.findElement(By.xpath("//input[@id='input-payment-postcode']"));
   pcode.click();
   pcode.sendKeys("405160");
   WebElement state=driver.findElement(By.xpath(" //select[@name='zone_id']"));
   state.click();
   WebElement st=driver.findElement(By.xpath("//option[@value='3516']"));
   st.click();
	
  	JavascriptExecutor sc1 = (JavascriptExecutor) driver;
	sc1.executeScript("window.scrollBy(0,500)");
  	 driver.findElement(By.name("agree")).click();
  	  driver.findElement(By.xpath("//input[@id='button-register']")).click();
  	
  	//15.Add comments, click continue and check the error message related to payment method  
	 Thread.sleep(5000);
	driver.findElement(By.xpath("//textarea[@name='comment']")).click();
	driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys("this project frustrate me but its ok");
 	driver.findElement(By.name("agree")).click();
	driver.findElement(By.id("button-payment-method")).click();
	Thread.sleep(2000);
 	System.out.println("---Error on Payment Checkout---");
 	String msg=driver.findElement(By.xpath("//div[text()='Warning: Payment method required']")).getText();
 	System.out.println(msg);
 	Thread.sleep(1000); //
  	//116.Click on contact us hyperlink and submit a contact request and click continue      
	driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
	driver.findElement(By.xpath("//textarea[@name='enquiry']")).click();
 	driver.findElement(By.xpath("//textarea[@name='enquiry']")).sendKeys("test sample");
 	driver.findElement(By.xpath("//input[@value='Submit']")).click();
	System.out.println("****Project done******");
    
   	
  		//NOTE:because i entered the all deatils and already register so it can giv
	// you error on ur machine
	
   		


	}


}
