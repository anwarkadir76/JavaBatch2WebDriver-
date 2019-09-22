package selenium.JavaScriptExecutor.Basictests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollPageDownUtiliTy {

	
	public static void scrollPageDown(WebDriver driver) {
		
	JavascriptExecutor  js=((JavascriptExecutor)driver );
	
	js.executeScript("window.scrollTO(0,document.body.scrollHeight)");
	}
}
