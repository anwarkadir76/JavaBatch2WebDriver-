package selenium.JavaScriptExecutor.Basictests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DrawBorderutility {

		
	
	public static void DrawBorder(WebElement  element1,WebDriver  driver)  {
		JavascriptExecutor  js=((JavascriptExecutor)driver);
		js.executeScript("agruments[0].style.border='3px  solid  red '",  element1);
		
	}
}
