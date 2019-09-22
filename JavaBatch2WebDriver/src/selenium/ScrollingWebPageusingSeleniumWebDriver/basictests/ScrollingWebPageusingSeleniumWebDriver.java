package selenium.ScrollingWebPageusingSeleniumWebDriver.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebPageusingSeleniumWebDriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
        
      //Maximise browser window
        driver.manage().window().maximize();
     
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
 //get webpage 
driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");

//using javascriptExecutor
JavascriptExecutor js=(JavascriptExecutor)driver;
//1.scrolling by using pixel
js.executeScript("window.scrollBy(0,5000)", "");
System.out.println(js.executeScript("window.scrollBy(0,5000)", driver.getTitle()));
Thread.sleep(3000);

js.executeScript("window.scrollBy(0,500)", "");
System.out.println(js.executeScript("window.scrollBy(0,500)", driver.getTitle()));
Thread.sleep(3000);


js.executeScript("window.scrollBy(0,200)", "");
System.out.println(js.executeScript("window.scrollBy(0,200)", driver.getTitle()));
Thread.sleep(3000);

js.executeScript("window.scrollBy(1000,5000)", "");
System.out.println(js.executeScript("window.scrollBy(1000,5000)", driver.getTitle()));
Thread.sleep(3000);

	}

}
