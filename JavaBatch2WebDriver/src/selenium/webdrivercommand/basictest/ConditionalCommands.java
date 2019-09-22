package selenium.webdrivercommand.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("https://www.itlearn360.com/");// get commands open the URL 
		
		
		//driver.findElement(By.xpath("//*[@id=\"loginlabel\"]")).isDisplayed();//boolean webelement identified the element,this methos isDisplay methos will return true or falls 
		WebElement login=driver.findElement(By.xpath("//*[@id=\"loginlabel\"]"));// 1.for login button ,store the element in login 
		WebElement username=driver.findElement(By.xpath("//*[@id=\"user_login\"]"));//2.for username texbox ,store the elemnt is user name 
		WebElement password=driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));//3.for password,store the lement is password
		WebElement LOGIN=driver.findElement(By.xpath("//*[@id=\"wp-submit\"]"));//4.LOGIN button 
		
		//create the Condition
		if (login.isDisplayed() && login.isEnabled())//1.
		{
			login.click();
		}
		
		
		if (username.isDisplayed() && username.isEnabled())//2
		{
		username.sendKeys("kadeer456");	
		}
			
		
		if (password.isDisplayed() && password.isEnabled())//3
		{
			password.sendKeys("kadeer456@#");	
		}
		
		if (LOGIN.isDisplayed() && LOGIN.isEnabled())//4
		{
			LOGIN.click();
		}
		
		
		
		driver.navigate().to("https://www.linkedin.com/");
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
		driver.navigate().to("https://www.itlearn360.com/");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[2]/div/nav[2]/ul/li[1]/a")).click();//my course page 
		driver.findElement(By.xpath("//*[@id=\"gk-login-toggle\"]/img")).click();//my course page image 
		driver.findElement(By.xpath("//*[@id=\"login_drop_panel\"]/div/ul/li[3]/a")).click();//logout my course page 
		driver.navigate().to("https://www.itlearn360.com/");// back to itlearn360 home page 
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.xpath("//*[@id=\"loginlabel\"]")).click();// click again login button 
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[1]/div/div/button")).click();//click on login with linked button 
		
		
		
		System.out.println (driver.findElement(By.xpath("//*[@id=\"loginbox\"]/div[1]/div/div/button")).isDisplayed());//i am print the status true or falss .login with linked xpath
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"loginbox\"]/h3")).isDisplayed());//login question
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[3]/a")).isDisplayed());//lost your password?
		
		WebElement linked=driver.findElement(By.xpath("//*[@id=\"loginbox\"]/div[1]/div/div/button"));//storge login with liked 
		WebElement LoginQuestion=driver.findElement(By.xpath("//*[@id=\"loginbox\"]/h3"));//storage LoGIN QUESTIN 
		WebElement lostyourpassword=driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[3]/a"));
		
		if (driver.findElement(By.xpath("//*[@id=\"loginbox\"]/div[1]/div/div/button")).isEnabled()==true) // login with Linkid and click on 
		{
			driver.findElement(By.xpath("//*[@id=\"loginbox\"]/div[1]/div/div/button")).click();
		}
		
		
		if (driver.findElement(By.xpath("//*[@id=\"loginbox\"]/h3")).isEnabled()==true)//Login question will select and click on 
		{
			driver.findElement(By.xpath("//*[@id=\"loginbox\"]/h3")).click();	
		}
			
		
		if (driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[3]/a")).isEnabled()==true)//lost your password question select and click on 
		{
			driver.findElement(By.xpath("//*[@id=\"loginform\"]/p[3]/a")).click();
		}
	}

}
