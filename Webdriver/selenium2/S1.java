package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class S1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gekodriver","./software/gekodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/Users/USER/Desktop/s1.html");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[contains(.,'mysore')]"));

	}

}
