package selenium.EncodedAndDecoded.tests;

import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseWithEncryptedPassword {

	public static String main(String[] args) {
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
driver.get("https://demo.nopcommerce.com/login");

//get Title and print

System.out.println(driver.getTitle());


//find Login element by link text 

driver.findElement(By.linkText("Log in")).click();

//find element Email text box by xpath 

driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("pavanoltraining@gmail.com");

//find element password by xpath 
driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(decodedString("dGVzdDEyMw=="));

// click login button 

driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/input")).click();

String decodeString(String password)
{
	
	byte[] decodedString=Base64.decodeBase64(password);
	return(new String( decodedString));
}

	}

	private static CharSequence decodedString(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
