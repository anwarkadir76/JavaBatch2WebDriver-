package selenium.HandlingCookiesinSelenium.basictests;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesExamples {

	public static void main(String[] args) {
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
driver.get("https://www.amazon.in/");

//capture all cookies from browser 
driver.manage().getCookies();

// storage some place in this values ,capture all cookies  from  browser 

Set<Cookie> cookies=driver.manage().getCookies();

cookies.size();

// //printe size of cookies

System.out.println("Size of Cookies :"  + cookies.size());

for(Cookie cookie:cookies);
{
	

Cookie cookie=null;
System.out.println(cookie.getName()+":"+cookie.getValue());

// adding new cookies in browser 

Cookie cookieobj=new Cookie("MyCookies123","1234567890");

driver.manage().addCookie(cookieobj);
cookies=driver.manage().getCookies();
System.out.println("Size of Cookies :"  + cookies.size());


}





	}

}
