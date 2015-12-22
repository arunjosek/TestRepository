package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class WindowHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
RemoteWebDriver driver = new FirefoxDriver();	
/*driver.get("http://www.crystalcruises.com");
driver.manage().window().maximize();
String mainwindow = driver.getWindowHandle();
System.out.println(mainwindow);
driver.findElementByLinkText("GUEST CHECK-IN").click();

Set<String> subwindow = driver.getWindowHandles();

 for (String swindow :subwindow){
	 driver.switchTo().window(swindow);
	 
 }
 
 driver.findElementById("txtFirstName").sendKeys("Sachin");
 driver.switchTo().window(mainwindow);
 driver.findElementByLinkText("ABOUT US").click();*/
//RemoteWebDriver driver = new FirefoxDriver();
driver.get("http://docs.seleniumhq.org/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

WebElement tooltip =driver.findElementByCssSelector("#menu_projects > a");
String toolti = tooltip.getAttribute("title");
System.out.println(toolti);

String title = driver.getTitle();
System.out.println(title);
try {
	Assert.assertEquals(title, "Selenium - Web Browser");
} catch (java.lang.AssertionError e) {
	// TODO Auto-generated catch block
	System.out.println("I have catched the exception"+e);
}
System.out.println("your page title is verified");
}
	
	}


