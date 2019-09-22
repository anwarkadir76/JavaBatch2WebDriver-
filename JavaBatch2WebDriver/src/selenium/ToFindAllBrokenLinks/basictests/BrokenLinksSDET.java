package selenium.ToFindAllBrokenLinks.basictests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksSDET {

	private static final TimeUnit TimeUnit = null;
	private static final String SECONDS = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		
		// Initiate driver 
    	
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
		
	
        
        
      //Maximise browser window
        driver.manage().window().maximize();
     
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
		
		//OPEN URL OF APPLICATIONS
		//driver.get("http://newtours.demoaut.com/");  //  http://demo.automationtesting.in/
		//driver.get("http://demo.automationtesting.in/");
		driver.get("https://www.itlearn360.com/");
		//driver.get("http://finder.cox.net/");
		
		//Wait 
		
		Thread.sleep(3000);//wait 5 seconds,  add throws interruptedException
		
		// capture all links from the webpage ,how will capture  all links how can we capture 
		
		driver.findElements(By.tagName("a"));// capture  all webelements by tagName ,then storage this elements 
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		
		//how many links to capture ,counts of size 
		
		links.size();//the prin the  the size 
		
		System.out.print(links.size());// Print all captures links numbers of elements 
		
		
		//read eachlinks that links provide broken use for loop 
		
		for(int i=0;i<links.size();i++)
		{
		// now by using "herf" properties attribute we canget url of required links
			
		WebElement	element=links.get(i);
		
		element.getAttribute("href");//get url of required links
		
		//storage that getAttribute 
		
		String url=element.getAttribute("href");
		
		//Create the URL Class object 
		
		URL link=new URL(url);// Import the class of java.net
		
		// Connection of the link ,create  Connection  using url object link 
		
		HttpURLConnection httpConn=(HttpURLConnection)link.openConnection();//  open url connection ,import class java.net
		
		// waite time 2 seconds 
		Thread.sleep(3000);
		
		
		// connect the methods use to estabich connection
		
		httpConn.connect();
		
		
		//capture responseCode 
		int resCode=httpConn.getResponseCode();// return the responseCode ,if resCode is above 400,this is broken link 
		
		// condition statment 
		
		if(resCode>=400)
		{
			
			System.out.println(url  + " - " + "is broken link");
		}
		else
		{
			
			System.out.println(url  + " - " + "is valid link");
		}
			
			
		}
		
	}

}	

