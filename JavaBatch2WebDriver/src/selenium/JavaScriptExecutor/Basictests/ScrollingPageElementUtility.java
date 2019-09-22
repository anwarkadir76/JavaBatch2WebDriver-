package selenium.JavaScriptExecutor.Basictests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollingPageElementUtility {

	
	public static void  scrollIntoview(WebElement element,WebDriver  driver) {
		
		
		JavascriptExecutor  js=((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView(true);)"  element);
	}
}
