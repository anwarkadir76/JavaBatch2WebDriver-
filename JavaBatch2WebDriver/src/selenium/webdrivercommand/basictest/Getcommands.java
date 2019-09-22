package selenium.webdrivercommand.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.itlearn360.com/");// get commands open the URL 
		
		//driver.getTitle();
		System.out.println("Title of the Page"+driver.getTitle());//return the title of the page 
		
		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());//return URL of the page 
		
		//getText() methods 
		String text=driver.findElement(By.xpath("//*[@id=\"blog\"]/div[1]/div[1]/div/div[2]/ul/a[1]/li")).getText();//return the text values of an element 
		System.out.println(text);
		
		//driver.findElement
		//(By.xpath("//*[@id=\"blog\"]/div[1]/div[1]/div/div[2]/ul/a[1]/li"))
		//.getText();//return the text values of an element 
		
		driver.close();//close current windows browser
		//driver.quit();//close multiple windows browsers
	}

}
