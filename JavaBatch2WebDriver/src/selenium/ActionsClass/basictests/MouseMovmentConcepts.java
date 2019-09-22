package selenium.ActionsClass.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovmentConcepts {

	public static void main(String[] args) throws InterruptedException {
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
 
 //Now Create one Actions class object ,import from selenium
 
 Actions  action=new Actions(driver);// inside Actions methods path "driver "  ,,  Actions(driver)
 
 action.moveToElement(driver.findElement(By.id("ctl00_HyperLinkLogin"))).build().perform();//login 
// action.moveToElement(driver.findElement(By.xpath("//*[@id=\"highlight-addons\"]/span[1]"))).build().perform();//Menue 
// action.moveToElement(driver.findElement(By.linkText("Check-In"))).build().perform(); //Check-In
 
 // After mouse over let sleep 3seconds 
 
 Thread.sleep(3000);//throws InterruptedException
 
 driver.findElement(By.linkText("Travel Agent Login")).click();// click Travel Agent Login 
	}

}
