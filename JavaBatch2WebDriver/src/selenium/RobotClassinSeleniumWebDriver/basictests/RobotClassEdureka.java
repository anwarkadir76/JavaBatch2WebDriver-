package selenium.RobotClassinSeleniumWebDriver.basictests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.glass.events.KeyEvent;

public class RobotClassEdureka {

	public static void main(String[] args) throws AWTException, InterruptedException  {
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
driver.get("https://stqatools.com/");

// find the web element  Course link text address 
driver.findElement(By.linkText("Selenium")).click();
// robot function for keyboard 
Robot robot=new Robot();//import java.awt.AWTException;  //import java.awt.Robot;

Thread.sleep(4000);// throws InterruptedException

//keyboard functions;To press down arrow key of Keyboard we use
robot.keyPress(KeyEvent.VK_DOWN);//This method with press down arrow key of Keyboard,To press down arrow key of Keyboard we use

Thread.sleep(4000);

//To press TAB key of keyboard
robot.keyPress(KeyEvent.VK_TAB);//To press TAB key of keyboard
Thread.sleep(4000);

System.out.println("anwar");

//To press TAB key of keyboard
robot.keyPress(KeyEvent.VK_TAB);//To press TAB key of keyboard
Thread.sleep(4000);
System.out.println("dilnur");


//To press TAB key of keyboard
robot.keyPress(KeyEvent.VK_TAB);//To press TAB key of keyboard
Thread.sleep(4000);
System.out.println("alnazar");


//This method with release down arrow key of Keyboard

robot.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(4000);
System.out.println("keyboard realese ");



//now go to mouse functions,This will move mouse pointer to the specified X and Y coordinates.

robot.mouseMove(30, 100);//This will move mouse pointer to the specified X and Y coordinates.
Thread.sleep(4000);
System.out.println("kadeer");


//This method will press the right click of your mouse.
robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
Thread.sleep(4000);
System.out.println("mutallip");


//This method will release the right click of your mouse
robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
Thread.sleep(4000);
System.out.println("ogulum");
 
	}

}
