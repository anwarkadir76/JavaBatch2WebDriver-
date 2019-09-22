package selenium.BarCodeAutomation.basictest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadTextFromBarCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
    
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
 //get webpage 
driver.get("https://testautomationpractice.blogspot.com/");// capture the web page image twoPLUGS,and take screenshot

//get Title and print

System.out.println(driver.getTitle());

	}

}
