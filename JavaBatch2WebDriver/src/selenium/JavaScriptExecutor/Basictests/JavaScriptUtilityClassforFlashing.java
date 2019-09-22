package selenium.JavaScriptExecutor.Basictests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptUtilityClassforFlashing {

	//methods one 
	
	public static final String DrawBoder = null;



	public static void  flash (WebElement  element,WebDriver  driver) {
	
		
	JavascriptExecutor  js=((JavascriptExecutor)driver);
	
	String  bgcolor=element.getCssValue("backgroundcolor");
	
	for(int i=0; i<=500; i++)// use for loop because the condition  multiply  repate times , chcke for loop statments 
	changeColor("#000000",element,driver);//black color 
	
	changeColor(bgcolor,element,driver);
	
	}
	
	
	
	//methods two 
	
	static void changeColor(String color, WebElement element, WebDriver driver) {
	
	
		
		JavascriptExecutor  js=((JavascriptExecutor)driver);
		
		js=executescript("arguments[0].style.backgroundColor=' "  +  color  +  " '  ", element, driver);
		
	}



	private static JavascriptExecutor executescript(String color, WebElement element,WebDriver driver) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
			
		
		


	
		}

		
			
		
		
	
	
	
	
	
