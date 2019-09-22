//https://www.toolsqa.com/selenium-webdriver/mouse-hover-action/
//https://www.toolsqa.com/selenium-webdriver/selenium-interview-questions-part-1/
//https://seleniumhq.github.io/selenium/docs/api/java/allclasses-noframe.html

//https://seleniumhq.github.io/selenium/docs/api/java/allclasses-noframe.html
package selenium.ActionsClass.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("Webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");// open browserd method stub
		
		WebDriver driver=new FirefoxDriver();//open gecko  driver
		
		
		
		driver.manage().window().maximize();
		
		// Launch the URL 
        driver.get("http://demoqa.com/menu/");
        System.out.println("demoqa webpage Displayed");
        
         //Maximise browser window
   driver.manage().window().maximize();
     
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
                
        //Instantiate Action Class        
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover 
     WebElement menuOption = driver.findElement(By.xpath(".//div[contains(text(),'Music')]"));
     //Mouse hover menuOption 'Music'
     actions.moveToElement(menuOption).perform();
     System.out.println("Done Mouse hover on 'Music' from Menu");
     
     //Now Select 'Rock' from sub menu which has got displayed on mouse hover of 'Music'
     WebElement subMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Rock')]")); 
     //Mouse hover menuOption 'Rock'
     actions.moveToElement(subMenuOption).perform();
     System.out.println("Done Mouse hover on 'Rock' from Menu");
     
     //Now , finally, it displays the desired menu list from which required option needs to be selected
     //Now Select 'Alternative' from sub menu which has got displayed on mouse hover of 'Rock'
     WebElement selectMenuOption = driver.findElement(By.xpath(".//div[contains(text(),'Alternative')]"));
     selectMenuOption.click();
     System.out.println("Selected 'Alternative' from Menu");
     
        // Close the main window 
     driver.close();
 }
 
}