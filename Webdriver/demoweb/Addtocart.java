package demoweb;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//to overcome from thread.sleep
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		/*JavascriptExecutor js = (JavascriptExecutor) driver;      //to scrolldown we use JavascriptExecutor explicity typecast and it consist on 2am
		js.executeAsyncScript("window.scrollBy(0,300)");*/
		//click o product
		driver.findElement(By.xpath("//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]")).click();//danger
		Thread.sleep(1500);
		//fill all the details
		driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Ajay");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("ajaygujjar424@gmail.com");
		driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("ajay");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("ajaygujjar424@gmail.com");
		driver.findElement(By.className("message")).sendKeys("samp");
		Thread.sleep(1500);//click on add to cart
		driver.findElement(By.xpath("//input[@value='Add to cart']")).click();//use search textfield to serch 2product and addtocart
		driver.findElement(By.xpath("//span[.='Shopping cart']")).click();
		driver.findElement(By.id("small-searchterms")).sendKeys("Computing and Internet");//search for product and add to cart
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	driver.findElement(By.xpath("//img[@alt='Picture of Computing and Internet']")).click();
	driver.findElement(By.id("add-to-cart-button-13")).click();
	driver.findElement(By.className("cart-label")).click();
	driver.findElement(By.name("removefromcart")).click();
	//driver.findElement(By.xpath("//input[@value='3181601']")).click();
	driver.findElement(By.id("termsofservice")).click();
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.findElement(By.id("Email")).sendKeys("ajaygujjar424@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("ajayajay");
	//driver.findElement(By.xpath("//select[@name='CountryId']")).click();
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.findElement(By.id("termsofservice")).click();
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
//	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@onclick='ShippingMethod.save()']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']")).click();
	Thread.sleep(1500);
	driver.findElement(By.linkText("Click here for order details.")).click();
	Thread.sleep(1500);
	driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	/*TakesScreenshot ts=(TakesScreenshot) driver;                  //  it's an interface which is typecasted from webdriver and 1am
	File src = ts.getScreenshotAs(OutputType.FILE);
    File dst=new File("C:\\ajay\\orderdetails.jpeg");
    FileUtils.copyFile(src,dst);*/                                   //to take screenshort
	driver.quit();

	
	
		
	}

}
