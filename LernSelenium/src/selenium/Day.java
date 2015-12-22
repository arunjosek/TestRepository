package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Day  {
	
	
	public static void main(String[] args)  {
		
		/*RemoteWebDriver driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement dropdown1 = driver.findElementByName("birthday_day");
		Select se = new Select(dropdown1);
		se.selectByVisibleText("6");
		WebElement text1 = driver.findElementById("u_0_1");
		text1.sendKeys("Arun");*/
		//PublicMethods d = new PublicMethods();
		//d.OpenBrowser("FiRefOX", "https://facebook.com");
		//d.TextBox(driver,"u_0_1", "Arun");
		PublicMethods e = new PublicMethods();
		e.OpenBrowser("FiRefOX", "https://facebook.com");
		e.Dropdown("birthday_day", "6");
	    try {
			e.TextBox("u_0_1", "Arun");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    e.radio("u_0_d");
	    e.checkbox("persist_box");
		
		//PublicMethods e = new PublicMethods();
		//e.radio("u_0_d");
		//PublicMethods f = new PublicMethods();
		//f.checkbox("persist_box");
		
		/*WebElement text1 = driver.findElementById("u_0_1");
		text1.sendKeys("Arun")*/
		
		
	}
}