package selenium.downloadaFileinChromeandFirefoxinSelenium.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileUsingChromeSDET {

	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initiate driver 
    	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
		
	
        
        
      //Maximise browser window
        driver.manage().window().maximize();
     
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
				
		//OPEN URL OF APPLICATIONS
				driver.get("http://demo.automationtesting.in/FileDownload.html");// download the file from this webpage 
				//Generated Text File to Download, find text box by id ,write some text send to text box 
			driver.findElement(By.id("textbox")).sendKeys("this is Download File From Chrome Testing material ");	
			// click the generate button
			driver.findElement(By.id("createTxt")).click();
			
			// click the download link 
			driver.findElement(By.linkText("link-to-download")).click();
			
			//driver quite 
			//driver.quit();
		
			//Generated PDF File to Download, find text box by id ,write some text send to text box 
						driver.findElement(By.id("pdfbox")).sendKeys(" Download File From Chrome Testing PDF material ");	
						// click the generate button
						driver.findElement(By.id("createPdf")).click();
						
						// click the download link 
						driver.findElement(By.linkText("pdf-link-to-download")).click();
	}

}
