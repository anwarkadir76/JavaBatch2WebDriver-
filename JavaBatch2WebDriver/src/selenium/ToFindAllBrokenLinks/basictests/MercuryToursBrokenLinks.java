package selenium.ToFindAllBrokenLinks.basictests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryToursBrokenLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String baseUrl = "http://demo.guru99.com/test/newtours/";					
		 System.setProperty("Webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");// open browserd method stub				
	        WebDriver driver = new FirefoxDriver();					
	        	driver.get("http://demo.guru99.com/test/newtours/");	
	        String underConsTitle = "Under Construction: Mercury Tours";					
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);					

				driver.get(baseUrl);					
	        List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
	        String[] linkTexts = new String[linkElements.size()];							
				int					i = 0;					

				//extract the link texts of each link element		
				for (WebElement e : linkElements) {							
				linkTexts[i] = e.getText();							
				i++;			
	        }		

				//test each link		
				for (String t : linkTexts) {							
				driver.findElement(By.linkText(t)).click();					
				if (driver.getTitle().equals(underConsTitle)) {							
	                System.out.println("\"" + t + "\""								
	                        + " is under construction.");			
	            } else {			
	                System.out.println("\"" + t + "\""								
	                        + " is working.");			
	            }		
				driver.navigate().back();			
	        }		
				driver.quit();			
	    }		

	}


