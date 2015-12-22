package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class PublicMethods {
	RemoteWebDriver driver;	
	public void OpenBrowser(String browser, String url){
		if (browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
			
		}
		else if (browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "F:/Selenium/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if (browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver","F:/Selenium/IEDriverServer.exe");
			driver = new InternetExplorerDriver();		
			
	}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void TextBox (String element, String text) throws Exception{
		//RemoteWebDriver driver = new FirefoxDriver();
		//driver.get("https://facebook.com");
	WebElement text2 = driver.findElementById(element);	
	text2.sendKeys(text);
	System.out.println(element);	
	}
	
	public void Dropdown (String str1, String str2){
		//driver = new FirefoxDriver();
		//driver.get("https://facebook.com");
		WebElement dropdown1 = driver.findElementByName(str1);
		Select se = new Select(dropdown1);
		se.selectByVisibleText(str2);
		List<WebElement>sele =driver.findElementsByTagName("a");
		System.out.println(sele.size());
		for(int i=0;i<sele.size();i++)
		{
			System.out.println(sele.get(i).getText());
		}
		
	}
	
	public void radio (String rad){
		Boolean state;
		//RemoteWebDriver driver = new FirefoxDriver();
		//driver.get("https://facebook.com");
		WebElement radio = driver.findElement(By.id(rad));
		state = radio.isSelected();
		System.out.println(state);
		radio.click();
		
	}
	
	public void checkbox (String chk){
		//RemoteWebDriver driver = new FirefoxDriver();
		//driver.get("https://facebook.com");
		WebElement chkbx = driver.findElement(By.id(chk));
		chkbx.click();
	}
}
