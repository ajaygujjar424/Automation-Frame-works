package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://login.yahoo.com");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("ajaygujjar1@gmail.com");
       driver.findElement(By.xpath("//input[@id='login-signin']")).click();
	}

}
