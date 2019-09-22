package selenium.JavaScriptExecutor.Basictests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class getTitleUtility {

	
	public static String  getTitleByJS(WebDriver  driver ) {
		
		JavascriptExecutor   js=((JavascriptExecutor)driver);
		String  title=js.executeScript("return  document.title;").toString();
		return  title();
	}

	private static String title() {
		// TODO Auto-generated method stub
		return null;
	}
}
