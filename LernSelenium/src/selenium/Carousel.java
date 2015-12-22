package selenium;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Carousel {

	public static void main(String[] args) throws InterruptedException {

		RemoteWebDriver driver =  new FirefoxDriver();
				driver.manage().window().maximize();
		driver.get("http://my.xfinity.com/?myxfn=true");
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("scrollBy(0,1000)");
		
		List<WebElement> el = driver.findElementsByXPath("//*[@id=\"hero-cover\"]/div[1]/ul/li");
		int hero_count = el.size();
		
		System.out.print(hero_count);
		for (int i=0;i<hero_count;i++){
		
		driver.findElementByXPath("//*[@id=\"hero-cover\"]/div[3]").click();
		Thread.sleep(2000);
		}
		driver.findElementByXPath("//*[@id=\"tv-carousel\"]/div[2]").click();
		

	}

}
