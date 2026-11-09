package testpkg;

import org.testng.annotations.Test;

import basepkg.BaseClass;
import pagepkg.RegisterPage;


public class RegisterTest extends BaseClass
{
 RegisterPage obj;
	
	@Test
	public void main() throws InterruptedException
	{
		

		obj = new RegisterPage(driver);
		obj.createpage();
		obj.dropdwon("agent");
		obj.register("maya", "manohar123456@gmail.com", "123", "123", "1023654710");
		obj.create();
		obj.logoclick();
		
	}

}
