package nopcom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void testLoginData() throws InterruptedException {

        // Enter username and password
    	 Thread.sleep(2000);
   	     driver.findElement(By.name("username")).sendKeys("Admin");
         driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
         driver.findElement(By.xpath("//button[@type='submit']")).click();  
        // Add assertions to verify successful login, for example:
        Assert.assertTrue(driver.getCurrentUrl().contains("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
        System.out.println("run");
    }

    @AfterMethod
    public void tearDown() 
    {
       driver.quit();
    }
}
