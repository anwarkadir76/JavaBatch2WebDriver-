package selenium.ActionsClass.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");// open browserd method stub
		
		 // Create a new instance of the Firefox driver
		   WebDriver driver = new FirefoxDriver();

		   // Launch the URL 
		   driver.get("https://demoqa.com/tooltip-and-double-click/");
		   System.out.println("demoqa webpage displayed");
			
		   //Maximise browser window
		   driver.manage().window().maximize();
		
		
		 
		 //Instantiate Action Class 
		 Actions actions = new Actions(driver); 
		 
		 //Retrieve WebElement to perform double click WebElement
		WebElement btnElement = driver.findElement(By.id("doubleClickBtn")); //this is double click button id address storage the " btnElement"
		 
		 //Double Click the button 
		 actions.doubleClick(btnElement).perform(); // double click we use this methods 
		 
		 System.out.println("Button is double clicked"); 
		 
		 //Following code just click on OK button on alert , this differs 
		 //depending upon application(under test) specific test case  
		 // Accept the Alert  
		 driver.switchTo().alert().accept(); //after double click there are alert box , and accepted the alert 
		 System.out.println("Double click Alert Accepted"); 
		 
		 //Close the main window 
		 //driver.close();
	}

}
