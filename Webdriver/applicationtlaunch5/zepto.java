package applicationtlaunch5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class zepto {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.uber.com");
			String title =driver.getTitle();
			System.out.print(title);
			String url=driver.getCurrentUrl();
			System.out.print(url);
		}
	}

