//https://stqatools.com/selenium-robot-class/


package selenium.RobotClassinSeleniumWebDriver.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.awt.AWTException;	
import java.awt.Robot;	
import java.awt.event.KeyEvent;	
import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;	
import org.openqa.selenium.firefox.FirefoxDriver;
public class RobotDemoExercise {

	public static void main(String[] args) throws AWTException, InterruptedException{
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
 
		
		
		
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
         driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	
         Robot robot = new Robot();  // Robot class throws AWT Exception	
         Thread.sleep(2000); // Thread.sleep throws InterruptedException	
         robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
         
         Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
         robot.keyPress(KeyEvent.VK_TAB);	
         Thread.sleep(2000);	
         robot.keyPress(KeyEvent.VK_TAB);	
         Thread.sleep(2000);	
         robot.keyPress(KeyEvent.VK_TAB);	
         Thread.sleep(2000);	
         robot.keyPress(KeyEvent.VK_ENTER);	
     // press enter key of keyboard to perform above selected action	
   }	 
}	
	


