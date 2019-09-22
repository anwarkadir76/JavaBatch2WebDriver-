package selenium.webdrivercommand.basictest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseAndQuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		
		//driver.get("http://www.popuptest.com/popuptest2.html");// get commands open the URL 
		
		
		driver.get("http://demo.automationtesting.in/windows.html");
		
		
		driver.close();// close only one window
		
		//driver.quit();//close all windows 
		
	}

}
