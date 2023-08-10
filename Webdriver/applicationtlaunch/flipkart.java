package applicationtlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipkart {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.driver","/software/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://flipkart.com");
			String title =driver.getTitle();
			System.out.print(title);
			String url= driver.getCurrentUrl();
			System.out.print(url);
			
		
	}

}
