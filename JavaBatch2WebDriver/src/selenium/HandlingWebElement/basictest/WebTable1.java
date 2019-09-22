package selenium.HandlingWebElement.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");// open browser
		WebDriver driver=new FirefoxDriver();//open gecko  driver
		
		driver.get("file:///C:/Program Files/ECLIPS/Excel sheet/caldata.xlsx");// open Url newtours
	
		
	}

}
