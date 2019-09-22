package selenium.FileUploaduUsingAutoIT;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadAutoITDemoFirefoxBrowser {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		//WebDriver driver=new  ChromeDriver();
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		WebDriver driver=new  FirefoxDriver();
		
		
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
//driver.findElement(By.id("imagesrc")).click();// this failed in Using Firefox browser to testing 

//so want to handle the Browser button in Firefox ,we using javascriptExecutor ,because the webdriver command click() can not working in firefox browser button 
WebElement button=driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));// using Browser button xpath addresss 

//1.going to javascriptExecutor to handle the browser button 

JavascriptExecutor  js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", button);

//use an integrate .exe file using in selenium webdriver script 

Runtime.getRuntime().exec("C:\\AUTOITFILES\\FileUpload1.exe"  +  "  "   +  "F:\\Screenshots\\Screenshot 2019-07-28 13.06.40.png");//  throw IOException,"C:\\AUTOITFILES\\FileUpload1.exe is which autoit script generated .exe file we saved in C driver "
Thread.sleep(3000);


//2.going to javascriptExecutor to handle the browser button 

js.executeScript("arguments[0].click();", button);

//use an integrate .exe file using in selenium webdriver script 

Runtime.getRuntime().exec("C:\\AUTOITFILES\\FileUpload1.exe"  +  "  "   +  "D:\\screenshot.png");//  throw IOException,"C:\\AUTOITFILES\\FileUpload1.exe is which autoit script generated .exe file we saved in C driver "
Thread.sleep(3000);


//3.going to javascriptExecutor to handle the browser button 

js.executeScript("arguments[0].click();", button);

//use an integrate .exe file using in selenium webdriver script 

Runtime.getRuntime().exec("C:\\AUTOITFILES\\FileUpload1.exe"  +  "  "   +  "D:\\Users\\Enver\\Videos");//  throw IOException,"C:\\AUTOITFILES\\FileUpload1.exe is which autoit script generated .exe file we saved in C driver "
Thread.sleep(3000);
	}

}
