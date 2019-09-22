package selenium.JavaScriptExecutor.Basictests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorActueltestcaseDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
        
      //Maximise browser window
        driver.manage().window().maximize();
     
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
 //get webpage 
driver.get("https://www.twoplugs.com/");

//get Title and print

System.out.println(driver.getTitle());



//NOW FLASHING THE "JOIN NOW FOR FREE "  GREEN COLOR BUTTON for change color many time , this is flasing

WebElement  joinfree=driver.findElement(By.xpath("/html/body/div/header/div/ul"));// find element by xpath and storage in element object 

//use JavaScriptUtilityClassforFlashing.java class

//JavaScriptUtilityClassforFlashing.flash( joinfree, driver);//  using utility class  JOIN NOW FOR FREE BUTTON 

///use DrawBorderutility.java class

DrawBorderutility .DrawBorder(joinfree, driver);// JOIN NOW FOR FREE BUTTON 

//take screenshoote after drawborde  JOIN NOW FOR FREE BUTTON 

File  src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("C://screenshot/twoplugs.png"));//throws IOException

//GET Title we can use webdriver command 

System.out.println(driver.getTitle());//  we use this command can get title in webdriver , 

//now use JavascriptExecutor also use getTitleUtility 

String title=getTitleUtility.getTitleByJS(driver);

System.out.print(title);


// click the element using javascriptExecutor ,,LOGIN BUTTON 
WebElement  loginbt=driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));//login button 
clickactionutility.clickElementByJS(loginbt, driver);



// Generate alert after click on Login button

generatealertutility.generateAlert(driver, "you click on login button .....");


//refreshing 

RefreshBrowserUtility.refreshBrowserByJS(driver );

// scrolling  the element which we choose in page 

//WebElement   image=driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));// computer image 
//ScrollingPageElementUtility.scrollIntoview(image, driver);// scrolling select element to show 

ScrollPageDownUtiliTy.scrollPageDown(driver);// scroll from start to end of the page 

	}
	

}
	
	
	
