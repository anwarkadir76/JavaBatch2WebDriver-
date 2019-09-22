//*http://practice.automationtesting.in/
//http://demo.automationtesting.in/Index.html
//http://demo.automationtesting.in/Windows.html 
package selenium.webdrivercommand.basictest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();//maximize window commends
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		driver.getTitle();//Frames & windows
		
		System.out.println(driver.getTitle());//Frames & windows
		
		
		driver.getWindowHandles();
		Set <String>  s=driver.getWindowHandles();
		
		for(String  i:s)
		{
		System.out.println(i);	//print ID of windows CDwindow-1A8497AF3CA5E6EF872090DA325D93C7  and CDwindow-EDCB9D6D8E35AC57BCD04848B1B004C4
		String  t=driver.switchTo().window(i).getTitle();	//get title  Sakinalium | Home   both switching child window http://www.sakinalium.in/
		System.out.println(t);
		
		if(t.contains("Frames & windows"))//close parent window http://demo.automationtesting.in/Windows.html ,open child window http://www.sakinalium.in/
		{
			driver.close();
		}
		}
		
	}

}
