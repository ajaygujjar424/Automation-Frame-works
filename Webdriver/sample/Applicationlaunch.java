package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Applicationlaunch {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.get("https://www.instagram.com");
Thread.sleep(2000);
driver.get("https://www.whatsapp.com");
Thread.sleep(2000);
driver.get("https://www.snapchat.com");
Thread.sleep(2000);
driver.get("https://www.blinkit.com");
Thread.sleep(2000);
driver.get("https://www.zepto.com");
Thread.sleep(2000);
	}

}
