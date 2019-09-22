package selenium.HandlingWebElement.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCaseWebTable {

	public static void main(String[] args) {
		// TODO Auto-generate
		
		System.setProperty("Webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");// open browserd method stub
		
		WebDriver driver=new FirefoxDriver();//open gecko  driver
		
		driver.get("http://opensource.demo.orangehrmlive.com/");// open Url OrangeHR
		
		
		driver.manage().window().maximize();
		
		//login
		
		driver.findElement(By.id("textUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("textPassword")).sendKeys("admin");
		
		driver.findElement(By.id("btnlogin")).click();
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		
		
		driver.findElement(By.id("menu_admin_viewSystemUser")).click();
		
		
	}

}
