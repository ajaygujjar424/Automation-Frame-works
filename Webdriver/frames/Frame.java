package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/USER/Desktop/s3.html");
        Thread.sleep(2000);
        driver.findElement(By.id("un")).sendKeys("abcd");
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        driver.findElement(By.id("pwd")).sendKeys("xyz");   
	}
}
