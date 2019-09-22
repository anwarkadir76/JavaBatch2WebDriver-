package selenium.WaiteCommands.basictest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitlyWaitConcepts {

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
 
	}

}
