package poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//declaration
public class pom {
	  @FindBy(id = "email")
  private WebElement untbox;
	  @FindBy(id = "pass")
	  private WebElement pwdbox;
	  @FindBy(xpath = "//button[@name='login']")
	  private WebElement loginbtm;
	  //initilization
	  public pom(WebDriver driver) {
		  PageFactory.initElements(driver, this);
	  }
  //utilization
	  public void sendun(String un)
	  {
		  untbox.sendKeys(un); 
	  }
	  public void sendpwd(String pwd) {
		  pwdbox.sendKeys(pwd);
	  }
	  public void click()
	  {
		  loginbtm.click();
	  }
  }

