package generic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testscript1 extends Generic
{
  @Test(invocationCount = 0)
  public void login()
  {
	  driver.findElement(By.name("email")).sendKeys("ajaygujjar424@gmail.com");
	  driver.findElement(By.name("pass")).sendKeys("ajay1999");
	  driver.findElement(By.name("login")).click();
	  
  }
}
