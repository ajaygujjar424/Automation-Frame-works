package generic;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generic {
	public WebDriver driver;
  @BeforeTest
  public void openapp() {
	  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    driver.close();
  }
 /*@AfterTest
	public void closeapp()
	{
		driver.close();
	}*/
}
  