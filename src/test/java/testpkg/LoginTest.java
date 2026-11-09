package testpkg;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.LoginPage;
import pagepkg.RegisterPage;

public class LoginTest extends BaseClass
{
	LoginPage ob;
	RegisterPage obj;
	
	@Test(priority = 1)
	public void logoverify() throws InterruptedException
	{
		ob= new LoginPage(driver);
		WebElement l=ob.log();
		if(l.isDisplayed())
			{
				System.out.println("logo is displayed");
			}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
	@Test(priority = 3)
	public void main() throws InterruptedException
	{
		ob.logclick();
		obj=new RegisterPage(driver);
		obj.createpage();
		obj.dropdwon("agent");
		obj.register("maonu", "monu12365@gmail.com", "123", "123", "1023654710");
		obj.create();
		ob.reg("monu12365@gmail.com", "123");
		ob.login();
	}
	@Test(priority = 2)
	public void titleverification()
	{
		String expected="Kerala Real Estate Website | Kerala Property";
		String actual=driver.getTitle();
		System.out.println(actual+ " "+expected);
		if(expected.equals(actual))
		{
			System.out.println("title verification : pass");
		}
		else
		{
			System.out.println("title verification : fail");
		}
	}

}



