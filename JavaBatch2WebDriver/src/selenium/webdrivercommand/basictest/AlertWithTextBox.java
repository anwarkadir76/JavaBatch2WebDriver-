package selenium.webdrivercommand.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
       WebDriver driver=new  ChromeDriver();// open browser 
		
		
		
       driver.get("http://demo.automationtesting.in/Alerts.html");
       
       //Alert with TextBox,find this element by xpath 
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
       
       
       //find element "click the button to demonstrate the prompt box  " button 
       
       driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
       
       // how to handling the alertbox and write the text in textbox 
       
       driver.switchTo().alert().sendKeys("Hello did you do third test case for Alertwith TextBox");
       driver.switchTo().alert().accept();
       
       
     String        ExpString="Hello Hello did you do third test case for Alertwith TextBox How are you today";
     String         ActString =driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
     
     if(ExpString.equals("ActString")==true)
     {
    	 
    	 System.out.println("Test is passed " );
     } 
       
       
	}

}
