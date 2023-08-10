package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gekodriver","./software/gekodriver");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/maps");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[@id='hArJGc']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("benglore");
		driver.findElement(By.xpath("//input[@tooltip='Choose destination']")).sendKeys("raichur");
		

	}

}
