package selenium.webdrivercommand.basictest;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrames_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				//ChromeDriver driver = new ChromeDriver();
		       WebDriver driver=new  ChromeDriver();// open browser 
				
		       driver.get("http://hugelearning.com/iframe-practice-page/");
		       
		       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// impilicitywait is always apply  globally i savailable for all  webelements ,which driver is interacting ,directly applyed  by driver 
		    
				
				driver.manage().window().maximize();
				
				//switch to frame ,there are three way to handle of the frame 
				
				//driver.switchTo().frame(1);// by index 
				//driver.switchTo().frame("IFrame1");//By id 
				// By xpath ,first storage the webelement in store 
				WebElement  frameXpath=driver.findElement(By.xpath("//*[@id=\"IFrame1\"]"));//first storage the xpath or othe webelement 
				driver.switchTo().frame(frameXpath);
				
				
				System.out.println(driver.switchTo().frame(frameXpath).getTitle());
				
	}

	
	}


