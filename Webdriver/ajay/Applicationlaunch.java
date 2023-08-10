package ajay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Applicationlaunch {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
driver.get("https://www.amazon.com");
Thread.sleep(2000);
String title=driver.getTitle();
System.out.print(title);
String url=driver.getCurrentUrl();
System.out.print(url);
driver.close();
	}

}
