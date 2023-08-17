package sdet;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login1 {
	@Test
	public void Login11() {
		WebDriver driver;
	WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	  // driver.findElement(By.name("")).getRect();
	    driver.quit();
	    
	    
	}
@Test
public void Login22() {
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.get("https://www.instagram.com/");
    driver.quit();	
	
}
}
