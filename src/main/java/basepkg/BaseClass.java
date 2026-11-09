package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;



public class BaseClass
{
	
	public WebDriver driver;
	public String url="https://keralaproperty.in/";
	
	@BeforeTest
	public void Start()
	{
		driver=new ChromeDriver();
		driver.get(url);
	}

}
