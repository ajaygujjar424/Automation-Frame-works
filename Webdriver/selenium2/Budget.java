package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Budget {

	public static void main(String[] args) 
	{
    System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
  WebDriver driver= new FirefoxDriver();
  driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");
  driver.findElement(By.xpath("//td[.='Pathaan (World) ']/../td[4]"));
  driver.findElement(By.xpath("///td[.='Attack']/../td[3]"));
	}

}
