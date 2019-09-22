package selenium.webdrivercommand.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchBetweenAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
       WebDriver driver=new  ChromeDriver();// open browser 
		
		
		
       driver.get("http://demo.automationtesting.in/Alerts.html");
       
       //Alert with OK link,find this element by xpath 
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
       
       
       //find element "click the button by display an alert " button 
       
       driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
       
       //can not ispect the windowbase application ,so how to switch to the windows in selenium comments 
       
       driver.switchTo().alert().getText();
       System.out.println( driver.switchTo().alert().getText());// take the alertbox text massages"I am an alert box!", before accept alert 
       
       
       driver.switchTo().alert().accept();
	}

}
