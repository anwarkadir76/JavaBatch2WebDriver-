package selenium.ActionsClass.basictests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("Webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");// open browserd method stub
		
		 // Create a new instance of the Firefox driver
		   WebDriver driver = new FirefoxDriver();

		   // Launch the URL 
		   driver.get("https://demoqa.com/tooltip-and-double-click/");
		   System.out.println("demoqa webpage displayed");
			
		   //Maximise browser window
		   driver.manage().window().maximize();
			 
		   
		   // the right click class start from here  ........
		   //Instantiate Action Class
		   Actions action = new Actions(driver);
			 
		   //Retrieve WebElement to perform right click
		   WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
			 
		   //Right Click the button to display Context Menu&nbsp;
		   action.contextClick(btnElement).perform();
		   System.out.println("Right click Context Menu displayed");
			 
		   //Following code is to select item from context menu which gets open up on right click, this differs 
		   //depending upon your application specific test case: 
		   //Select and click 'Copy me' i.e. 2nd option in Context menu 
		   WebElement elementOpen = driver.findElement(By.xpath(".//div[@id='rightclickItem']/div[1]"));  
		   elementOpen.click(); 
			System.out.println("You have selected Copy");
			
		   // Accept the Alert 
		   driver.switchTo().alert().accept();
		   System.out.println("Right click Alert Accepted");
			 
		   // Close the main window 
		  // driver.close();
	}

}
