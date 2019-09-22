package selenium.webdrivercommand.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
       WebDriver driver=new  ChromeDriver();// open browser 
		
		
		
       driver.get("https://www.w3schools.com/");
       driver.manage().window().maximize();
       
       //Search  w3schools 
       driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/i")));
       //driver.switchTo().frame("w3c");
       
       //
       driver.findElement(By.xpath("//*[@id=\"___gcse_0\"]/div/div/form/table/tbody/tr/td[2]/button")).click();
       driver.findElement(By.name("search")).sendKeys("kadeer's test automation website ");
       
       
       
	}

}
//file:///C:/Program%20Files/ECLIPS/MrFrames/file/W3Schools%20Online%20Web%20Tutorials.html
//file:///C:/Program%20Files/ECLIPS/MrFrames/file/Downloads.html
//file:///C:/Program%20Files/ECLIPS/MrFrames/file/Handle%20Frames%20in%20Selenium%20Webdriver%20and%20How%20to%20Switch%20frames.html