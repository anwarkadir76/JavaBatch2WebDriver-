package selenium.GoogleSearchTest.Basictests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
        
    
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
 //get webpage 
driver.get("https://www.Google.com/");


//  find element for search box 

driver.findElement(By.name("q")).sendKeys("java");//  we can change the value sendkeys 
Thread.sleep(10000);

// find all search name after input word "java"  in search box by xpath 

List <WebElement>   list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']")); 
		
System.out.println(list.size());	//  input "java " words insearch box will show 10 list in search box 


for(int   i=0;  i<list.size();i++) {
String  listitem=list.get(i).getText();

System.out.println(listitem);

//if(listitem.contains("java download")) //  we can chanege the value every time for any other search issues
	if(listitem.contains("java download"))
{
list.get(i).click();

break;

}
	
}


	}

}
