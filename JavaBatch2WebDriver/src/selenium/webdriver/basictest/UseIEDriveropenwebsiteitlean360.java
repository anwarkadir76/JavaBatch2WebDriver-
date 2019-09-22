package selenium.webdriver.basictest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class UseIEDriveropenwebsiteitlean360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "C://Program Files//IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://newtours.demoaut.com/");
	}

}