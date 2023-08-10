package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import generic.Generic1;
import poms.pom;

public class testscript extends Generic1 {
  @Test
  public void test1() {
		/*System.setProperty("webdriver.gecko.driver","./software/geckodriver");
		 WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.facebook.com/");*/
		 pom p =new pom(driver);
		 p.sendun("ajaygujjar424@gmail.com");
		 p.sendpwd("ajay1999");
		 p.click();
	  
  }
}
  
  // we can run the program through test script also and runner also
