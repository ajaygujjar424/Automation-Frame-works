package generic;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Testscript1 extends Generic
{
  @Test
  public void login()
  {
	  driver.findElement(By.id("email")).sendKeys("ajaygujjar424@gmail.com");
	  driver.findElement(By.name("pass")).sendKeys("ajay5555555");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
}
