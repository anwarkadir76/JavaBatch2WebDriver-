package selenium.webdrivercommand.basictest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();//maximize window commends
		
	WebElement	element=driver.findElement(By.id("animals"));//identified the webelement then store some place in this webelement
	
	Select se=new Select(element);
	
	List originalList=new ArrayList();
	
	List<WebElement>option=se.getOptions();
	
	for (WebElement e:option) {
		
		originalList.add(e.getText());
	}
	System.out.println("originalList:"  +  originalList);
	//* this option print 
	//originalList:[Cat
	 // , Baby Cat
	//  , Big Baby Cat
	//  , Avatar
	// ]  */
		
	List tempList=new ArrayList();
	tempList=originalList;
	System.out.println("Before Sorting tempList:"  +  tempList);// print before sorting templist 
	
	//sort the templist 
   Collections.sort(tempList);
   System.out.println("After sorting temp list :"   +   tempList);
   
   if(originalList==tempList)
   {
	   System.out.println("Dropdown sorted");
   }
   
   else
   {
	   System.out.println("DropDown not sorted");
   }
	}

}
