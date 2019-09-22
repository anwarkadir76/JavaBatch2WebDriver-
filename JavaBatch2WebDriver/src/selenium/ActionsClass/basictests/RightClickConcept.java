package selenium.ActionsClass.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("Webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");// open browserd method stub
		
		WebDriver driver=new FirefoxDriver();//open gecko  driver
		
		
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
		
	
        
        
      //Maximise browser window
        driver.manage().window().maximize();
     
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
		
		//Launching Sample site
				driver.get("http://artoftesting.com/sampleSiteForSelenium.html");
				
				//Right click in the TextBox
				Actions action = new Actions(driver);
				WebElement searchBox = driver.findElement(By.id("fname"));
				action.contextClick(searchBox).perform();// right click we use this methods 
				
				//Thread.sleep just for user to notice the event
				Thread.sleep(3000);
				
				//Closing the driver instance
				//driver.quit();
	}

}
