package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Instalogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ajaygujjar424@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ajay1999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	//	driver.findElement(By.xpath("//button[.='Not Now']")).click();
	//	driver.findElement(By.xpath("//div[.='Messages']")).click();
	}

}
