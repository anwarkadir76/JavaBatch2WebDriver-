package selenium.AuthenticationPopupTest.BasicTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
       WebDriver driver=new  ChromeDriver();// open browser 
		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");//open url , how we can handle Authentication popup 
		//  http://username:password@test.com
		
       driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");// Basically windows identification popups 
       
       //find element by cssSelector 
   String    text=driver.findElement(By.cssSelector("p")).getText();
   
   System.out.println(text);
		
	}

}
