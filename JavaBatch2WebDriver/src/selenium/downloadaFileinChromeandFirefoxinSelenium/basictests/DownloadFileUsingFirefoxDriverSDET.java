package selenium.downloadaFileinChromeandFirefoxinSelenium.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class DownloadFileUsingFirefoxDriverSDET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		
		
		
		
		WebDriver driver = null;
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
		
	
        
        
      //Maximise browser window
        driver.manage().window().maximize();
     
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
 //creating browser profile ,import Firefoxprofile in selenium 
 
 FirefoxProfile  profile=new FirefoxProfile();
 profile.setPreference("browser.helperApps.neverAsk", "Text");
 
 
 profile.setPreference("browser.download.manager.showWhenStarting", "false");
 
 FirefoxOptions  option=FirefoxOption();
 
 option.setProfile(profile);
 WebDriver driver1 = new FirefoxDriver();
 
		//OPEN URL OF APPLICATIONS
				driver1.get("http://demo.automationtesting.in/FileDownload.html");// download the file from this webpage 
				
				
				//Generated Text File to Download, find text box by id ,write some text send to text box 
			driver1.findElement(By.id("textbox")).sendKeys("this is Download File From Chrome Testing material ");	
			// click the generate button
			driver1.findElement(By.id("createTxt")).click();
			
			// click the download link 
			driver1.findElement(By.linkText("link-to-download")).click();
			
			//driver quite 
			//driver.quit();
		
			//Generated PDF File to Download, find text box by id ,write some text send to text box 
						driver1.findElement(By.id("pdfbox")).sendKeys(" Download File From Chrome Testing PDF material ");	
						// click the generate button
						driver1.findElement(By.id("createPdf")).click();
						
						// click the download link 
						driver1.findElement(By.linkText("pdf-link-to-download")).click();
	}

	private static FirefoxOptions FirefoxOption() {
		// TODO Auto-generated method stub
		return null;
	}

}
