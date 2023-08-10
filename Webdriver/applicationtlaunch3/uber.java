package applicationtlaunch3;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class uber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://uber.com");
		String title =driver.getTitle();
		System.out.print(title);
		String url=driver.getCurrentUrl();
		System.out.print(url);
	}

}
