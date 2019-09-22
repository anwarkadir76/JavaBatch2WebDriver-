package selenium.JavaScriptExecutor.Basictests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class RefreshBrowserUtility {

	
	private JavascriptExecutor driver;

	public static void refreshBrowserByJS(WebDriver  driver ) {
		// TODO Auto-generated method stub
		
	}
	
	JavascriptExecutor  js=((JavascriptExecutor)driver);
	 js.executeScript("History.go(0)");
	
}
