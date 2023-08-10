package hiver;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiver {

	/*public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://hiverhq.com/");
		driver.findElement(By.xpath("//span[@class='ga_send']")).click(); // click on get Hiver Free

		driver.findElement(By.name("full_name")).sendKeys("ajay");  //name  ....xpath =  //input[@id='full_name-b1927dbb-eee2-4af5-8109-973f7b373a6b']
		
		driver.findElement(By.xpath("//input[@id='phone-b1927dbb-eee2-4af5-8109-973f7b373a6b']")).sendKeys("9483512449");
		
		driver.findElement(By.xpath("//input[contains(@id, 'email-b1927dbb-eee2-4af5-8109-973f7b373a6b')]")).sendKeys("Farha@mygate.in"); // contains ....xpath
		
		driver.findElement(By.xpath("//select[@id='team_use_case-b1927dbb-eee2-4af5-8109-973f7b373a6b']")).click(); //xpath
		
    	driver.findElement(By.xpath("//input[@value='GET HIVER FREE']")).click(); //xpath
    	

    	driver.get("https://chrome.google.com/webstore/detail/hiver-gmail-based-custome/fcinnggknmdfkilogcndkgpojpfojeem?hl=en-GB");
    	driver.findElement(By.xpath("//div[@class='h-e-f-Ra-c e-f-oh-Md-zb-k']")).click(); 
	
    	// screenshot.........
	/*TakesScreenshot ts=(TakesScreenshot) driver;                
	File src = ts.getScreenshotAs(OutputType.FILE);
    File dst=new File("C:\\ajay\\logindetailss.jpeg"); //path of file
    FileUtils.copyFile(src,dst);*/ 
    	
   // driver.close();*/
	
public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	 driver.get("https://hiverhq.com/");
		driver.findElement(By.xpath("//span[@class='ga_send']")).click(); 
		//driver.findElement(By.name("full_name")).sendKeys("Farhanaz"); 
		driver.findElement(By.xpath("//input[contains(@id,'full_name-b1927dbb-eee2-4af5-8109-973f7b373a6b')]")).sendKeys("Farhanaz");
		driver.findElement(By.xpath("//input[@id='phone-b1927dbb-eee2-4af5-8109-973f7b373a6b']")).sendKeys("8147672220");			
		driver.findElement(By.xpath("//input[contains(@id, 'email-b1927dbb-eee2-4af5-8109-973f7b373a6b')]")).sendKeys("farha.naz@mygate.in"); // contains ....xpath
		
		driver.findElement(By.xpath("//select[@id='team_use_case-b1927dbb-eee2-4af5-8109-973f7b373a6b']")).click();
		
    	//driver.findElement(By.xpath("//input[@value='GET HIVER FREE']")).click(); 
    	//driver.findElement(By.xpath("//div[@aria-label='Add to Chrome']")).click();
    	TakesScreenshot tss=(TakesScreenshot) driver;                
    	File src = tss.getScreenshotAs(OutputType.FILE);
        File dst = new File("C:\\Selenium screenshorts\\.jpeg"); //path of file//  C:\\Selenium screenshorts
        FileUtils.copyFile(src,dst);
        driver.close();
    	driver.quit();
}

}
