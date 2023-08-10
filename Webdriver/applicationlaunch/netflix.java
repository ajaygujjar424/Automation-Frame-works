package applicationlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class netflix {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
      driver.get("https://netflix.com");
     Thread.sleep(1000);
     String title=driver.getTitle();
     System.out.print(title);
     String url=driver.getCurrentUrl();
     System.out.print(url);
	}
}
