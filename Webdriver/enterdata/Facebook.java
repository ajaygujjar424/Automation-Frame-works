package enterdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("WebDriver.chromedriver","/software/ChromeDriver.exe");
    WebDriver driver= new ChromeDriver();
   driver.get("https://www.facebook.com");
   Thread.sleep(1500);
   driver.findElement(By.id("email")).sendKeys("ajaygujjar424gmail.com");
   Thread.sleep(1500);
   driver.findElement(By.id("pass")).sendKeys("ajay1999");
   Thread.sleep(1500);
   driver.findElement(By.name("login")).click();
 
    
	}

}
