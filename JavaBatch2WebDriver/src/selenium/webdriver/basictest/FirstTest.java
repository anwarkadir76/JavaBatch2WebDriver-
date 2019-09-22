/* TestCase 
 * Open the browser 
 * Open the URL( http://newtours.demoaut.com/)
 * Enter use name 
 * Enter password 
 * click on singing button 
 * check the page title 
 */

package selenium.webdriver.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FirstTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.itlearn360.com/");
		
		driver.findElement(By.id("loginlabel")).click();
		driver.findElement(By.name("log")).sendKeys("kadeer456");
		driver.findElement(By.name("pwd")).sendKeys("kadeer456@#");
		driver.findElement(By.name("wp-submit")).click();
		
		driver.findElement(By.name("log")).sendKeys("enverkadir507@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("kadeer456@#");
		driver.findElement(By.name("wp-submit")).click();
		
		//System.out.println("Title of Page "+driver.getTitle());
		
		String acttitle=driver.getTitle();
		
	String exptitle="Online IT Certification Training Courses |AWS Certification Training, Selenium, Learn Java in Virginia &raquo; Comments Feed";
		
		
		if (exptitle.equals(acttitle))
			
		{
			System.out.println("test is passed");
		}
		
		else {
			System.out.println("test is failed ");
		}
		
		driver.close();
		//driver.quit();
	}

}
