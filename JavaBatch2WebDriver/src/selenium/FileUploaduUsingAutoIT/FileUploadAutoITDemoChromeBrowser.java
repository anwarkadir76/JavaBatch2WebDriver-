package selenium.FileUploaduUsingAutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadAutoITDemoChromeBrowser {

	public static void main(String[] args) throws IOException {
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
driver.get("http://demo.automationtesting.in/Register.html");

// find the web element  Course link text address 
driver.findElement(By.id("imagesrc")).click();

//use an integrate .exe file using in selenium webdriver script 

Runtime.getRuntime().exec(" C:\\AUTOITFILES\\FileUpload1.exe"  +  "  "   +  "F:\\Screenshots\\Screenshot 2019-07-28 13.06.40.png");//  throw IOException,"C:\\AUTOITFILES\\FileUpload1.exe is which autoit script generated .exe file we saved in C driver "
	}

}
