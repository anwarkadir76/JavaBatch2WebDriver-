package selenium.ActionsClass.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");// open browserd method stub
		
		WebDriver driver=new FirefoxDriver();//open gecko  driver
		
		
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
		
		// Launch the URL 
        driver.get("https://www.spicejet.com/");
        System.out.println("demoqa webpage Displayed");
        
        
      //Maximise browser window
        driver.manage().window().maximize();
     
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
 // get webpage url 
 
 driver.get("http://jqueryui.com/droppable/"); // until here every code same and common  parts .
 
// now because at web site there are frame including the source webelement and target webelement inside the Frame so we use 
 
 driver.switchTo().frame(0);// find the frame 
 
 // Create the actions class object for Drag and Drop . 
 
 Actions  action=new Actions(driver);// import selenium actions class 
 
 action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")))// find sourceelemenet xpath ,action click on the source element and hold on 
.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))// then move to the source element to target element xpath  place 
 .release()// the release the source element in this target space 
 .build()//build 
 .perform();// performe 
 
 
 
 
	}

	
		
	}


