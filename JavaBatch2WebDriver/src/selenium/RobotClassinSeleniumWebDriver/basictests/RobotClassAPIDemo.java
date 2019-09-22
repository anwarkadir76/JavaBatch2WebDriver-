// https://www.joecolantonio.com/getting-started-robot-framework-java/


package selenium.RobotClassinSeleniumWebDriver.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class RobotClassAPIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		
		WebDriver driver=new  FirefoxDriver();
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
        
      //Maximise browser window
        driver.manage().window().maximize();
     
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
 //get webpage 
driver.get("http://spreadsheetpage.com/index.php/site/file/year_calendar_workbook");
 
 
	}

}
