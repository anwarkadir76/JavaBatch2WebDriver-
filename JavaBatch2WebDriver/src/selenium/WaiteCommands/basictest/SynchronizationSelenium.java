package selenium.WaiteCommands.basictest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchronizationSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
	System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);// impilicitywait is always apply  globally i savailable for all  webelements ,which driver is interacting ,directly applyed  by driver 
		
		driver.get("https://www.facebook.com/");// get commands open the URL 
		
		
		WebElement firstname=driver.findElement(By.name("firstname"));//first name inspection 
		WebElement lastname=driver.findElement(By.name("lastname"));//lastname inspection 
		WebElement mobilenumber=driver.findElement(By.name("reg_email__"));//mobile number or email inspection
		WebElement password=driver.findElement(By.name("reg_passwd__"));//password inspection
		WebElement singin=driver.findElement(By.className("websubmit"));//sign in button 
		
		
		sendkeys(driver,firstname,10,"AN");
		sendkeys(driver,lastname,5,"KA");
		sendkeys(driver,mobilenumber,5,"7039406646");
		sendkeys(driver,password,5,"Enveruygur2016");
		ClickOn(driver,singin,5);//click on Singin button
		
		
		WebElement forgetAccount=driver.findElement(By.linkText("Forgot account?"));
				ClickOn(driver,forgetAccount,5);
	  
	}
	
	
	// we can write below two methods ,this is First methods for inspected login page elements
	public static void sendkeys(WebDriver driver,WebElement element ,int timeout,String value)
	{
		new WebDriverWait(driver,timeout);
		until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
	
		
	}

    // second methods for inspected click on elements 
	public static void ClickOn(WebDriver driver ,WebElement element,int timeout) {
		
		new WebDriverWait(driver,timeout);
		until(ExpectedConditions.elementToBeClickable(element));
		element.click();
			
	
}
	private static void until(ExpectedCondition<WebElement> expectedCondition) {
		WebDriver driver=new FirefoxDriver();
		// TODO Auto-generated method stub
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("xpath-here")));
	}
	
	}
	


