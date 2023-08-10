package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class instagram {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1500);
		driver.get("https://www.instagram.com");
	       Thread.sleep(1500);
	       driver.findElement(By.cssSelector("input[name='username']")).sendKeys("ajay");
	       driver.findElement(By.cssSelector("input[type='password']")).sendKeys("uygfh9hof");
	       Thread.sleep(1500);
	       driver.findElement(By.cssSelector("button[type='submit']")).click();
	       Thread.sleep(2000);
	       driver.quit();
		
	}

}
