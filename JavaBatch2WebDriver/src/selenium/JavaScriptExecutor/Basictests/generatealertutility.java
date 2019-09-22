package selenium.JavaScriptExecutor.Basictests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class generatealertutility {

	
	public static void generateAlert(WebDriver  driver, String  message) {
		
		JavascriptExecutor  js=((JavascriptExecutor)driver);
		js.executeScript("alert (' " + message + " ')");
	}
}
