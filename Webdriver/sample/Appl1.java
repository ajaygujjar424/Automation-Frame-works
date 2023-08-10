package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Appl1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		  driver.findElement(By.id("email")).sendKeys("ajaygujjar424@gmail.com");
		  driver.findElement(By.name("pass")).sendKeys("ajay1999");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  String title = driver.getTitle();
		  System.out.println(title);
	}

}
