package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Generic1 {
	public WebDriver driver;
	  @BeforeTest
	  public void openapp() {
		  System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	      driver=new FirefoxDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		  driver.get("https://www.facebook.com");
	  }
	 @AfterTest
		public void closeapp()
		{
			driver.close();
		}
	}