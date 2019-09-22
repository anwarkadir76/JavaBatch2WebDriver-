package selenium.webdrivercommand.basictest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");// open browser 
		FirefoxDriver driver = new FirefoxDriver();//create driver object 
		
		
		driver.get("https://www.itlearn360.com/");// get commands open the URL 
		
		System.out.println(driver.getTitle());// take itlear360 page title :"Online IT Certification Training Courses |AWS Certification Training, Selenium, Learn Java in Virginia 
		
		
		driver.navigate().to("https://www.facebook.com/");//driver navigate to from itlearn360 to facebook page open facebook page 
		
		System.out.println(driver.getTitle());// take facebook page title "Facebook - Log In or Sign Up"
		
		driver.navigate().back();
		System.out.println(driver.getTitle());// get title of itlearn360 "Online IT Certification Training Courses |AWS Certification Training, Selenium, Learn Java in Virginia "

		driver.navigate().forward();
		System.out.println(driver.getTitle());// get title of facebook "Facebook - Log In or Sign Up" 
		
		
		driver.navigate().refresh();
		
		driver.close();
		
		
	}
	
}
		
		
		
		
		
		



