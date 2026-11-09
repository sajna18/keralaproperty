package pagepkg;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
WebDriver driver;
	
	@FindBy(xpath="/html/body/header/div[1]/div/a[1]") WebElement  button;
	@FindBy(linkText="New user?") WebElement  newuserbutton;
	@FindBy(name="listowner") WebElement  owner;
	@FindBy(id="utitle") WebElement  uname;
	@FindBy(id="umail") WebElement  email;
	@FindBy(id="memberpass") WebElement  pass;
	@FindBy(id="repass") WebElement  cpas;
	@FindBy(id="umobile") WebElement  mob;
	@FindBy(id="sub_regbutton") WebElement  submit;

	
	public RegisterPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	
	public void createpage()
	{
		button.click();
		newuserbutton.click();
	}
	
	public void dropdwon(String value)
	{
		WebElement ob= owner;
		Select a= new  Select(ob);
		a.selectByValue(value);
	}
	
	public void register(String n,String e,String p,String cp,String m)
	{
		uname.sendKeys(n);
		email.sendKeys(e);
		pass.sendKeys(p);
		cpas.sendKeys(cp);
		mob.sendKeys(m);
	}
	
	public void create() throws InterruptedException
	{
		submit.click();
	//	Thread.sleep(3000);
//		Alert a=driver.switchTo().alert();
//		Thread.sleep(3000);
//		a.accept();
	}

	public void logoclick() throws InterruptedException
	{
		Thread.sleep(3000);
		button.click();
	}

}
