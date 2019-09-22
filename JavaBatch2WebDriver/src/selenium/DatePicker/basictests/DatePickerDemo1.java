package selenium.DatePicker.basictests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.condition.Text;

public class DatePickerDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String   month="September 2019";
		
		String   day="29";
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
        
    
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
 //get webpage 
driver.get("https://www.phptravels.net/");


//  find element for search box 

driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input")).click();// find Check in calendar by xpath and click on  
Thread.sleep(2000);


while(true)
{
//find element "September  2019 " 	in check in calendar by xpath 
	String  text=driver.findElement(By.xpath("/html/body/div[13]/div[1]/table/thead/tr[1]/th[2]")).getText();
	
	if(text.equals(month))
	{
		
		break;
	}
	else {
		
		//     find current month we click the sign "<" again and again . son find this sing's xpath 
		driver.findElement(By.xpath("/html/body/div[13]/div[1]/table/thead/tr[1]/th[3]")).click();
	}
	
	//  idendify the date from the table of calendar   by use xpath to whole data table 
	
	driver.findElement(By.xpath("//div[9]//div[1]//table[1]//tbody[1]//tr//td[contains(text(),"+day+")]")).click();
}


	}

}
