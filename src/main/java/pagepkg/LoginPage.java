package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver driver;
	
	@FindBy(id="ulogin") WebElement user;  // WebElement email= driver.findelement();
	@FindBy(id="upass") WebElement pass;
	@FindBy(xpath ="/html/body/header/div[1]/div/a[1]") WebElement  button;
	@FindBy(id="sub_logbtn") WebElement  logbutton;
    @FindBy(xpath="/html/body/header/div[2]/div/a[1]") WebElement logo;
   
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);  
	}
	
	public WebElement log() throws InterruptedException
	{
		
		return logo;
	}
	public void logclick()
	{
		button.click();
	}
	public void reg(String username,String password)
	{
		
		user.sendKeys(username);
		pass.sendKeys(password);
	}
	public void login()
	{
		logbutton.click();
	}
	

}
