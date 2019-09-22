package selenium.webdrivercommand.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithOkCancelButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
       WebDriver driver=new  ChromeDriver();// open browser 
		
		
		
       driver.get("http://demo.automationtesting.in/Alerts.html");
       
       //Alert with OK Cancel link,find this element by xpath 
       driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
       
       
       //find element "click the button to display confirme box " button 
       
       driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
       
       //can not ispect the windowbase application ,so how to switch to the windows in selenium comments 
       
       driver.switchTo().alert().getText();
       System.out.println( driver.switchTo().alert().getText());// take the alertbox text massages"I am an alert box!", before accept alert 
       
       String ExpTextOK="You pressed Ok";//EXPECTTEXT FOR OK BUTTON 
       
       String ExpTextCancel="You Pressed Cancel";//Exptextext of cancel button 
       driver.switchTo().alert().accept();
       
    String ActText1=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();// ActText1---OK button
    
    if(ExpTextOK.contentEquals("ActText1")==true);
    {
    	System.out.println("Test is passed ");
    }
    driver.switchTo().alert().dismiss();// if we choose cancel button 
    
   String ActText2=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();//ActText2---Cancel button
   
   if(ExpTextCancel.equals("ActText2")==true)
   {
	   System.out.println("Test is passed "); 
   }
	}
  
}