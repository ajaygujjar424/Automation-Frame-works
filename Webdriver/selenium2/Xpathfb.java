package selenium2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathfb {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ajaygujjar424@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("ajay19998455515");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	 driver.quit();
	}

}
