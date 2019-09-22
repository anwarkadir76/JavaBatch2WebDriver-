package selenium.HandlingWebElement.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VolunteerSignUpForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("https://goo.gl/kNZ6Sr");
		
		// Identify the textbooks element step by step Name , City ,Email Address and Phone 
		driver.findElement(By.id("RESULT_TextField-2")).sendKeys("anwar");
		driver.findElement(By.id("RESULT_TextField-3")).sendKeys("Fairfax");
		driver.findElement(By.id("RESULT_TextField-4")).sendKeys("anwarkadir76@yahoo.com");
		driver.findElement(By.id("RESULT_TextField-5")).sendKeys("7039406646");
		
		//identify the drop down box elements  by select 
		
		WebElement drptime=driver.findElement(By.id("RESULT_RadioButton-6"));
		Select timedrp=new Select(drptime);
		// select the value of select class object ,there are three diffirent select in webpage 
		
		//timedrp.selectByIndex(2);//select by index 
		//timedrp.selectByValue("Radio-2");//select by value 
		timedrp.selectByVisibleText("Evening");//select by visible text
		
		//valideted number of elements in drop down box ,i take timedrp value create get all elements from dropdown box 
		
		timedrp.getOptions().size();//get number of element from drop down box
		
		//print number of elemnet in drop down box 
		
		System.out.println(timedrp.getOptions().size());
		
		//now go to two radio button ,the validation first we not select any radio butto ,for validation write Conditional command 
		
		driver.findElement(By.id("RESULT_RadioButton-7_0")).isSelected();// the result must give false , because we not selected this button 
		//print this selection return false 
		
		System.out.println(driver.findElement(By.id("RESULT_RadioButton-7_0")));//give result false 
		
		
		// now go to select YES radio button 
		driver.findElement(By.id("RESULT_RadioButton-7_0")).click();//this click will  select the YES radio button 
		
		// now go to validate Check box  selection , Check box we use click() action 
		
		driver.findElement(By.id("RESULT_CheckBox-8_0")).click();
		driver.findElement(By.id("RESULT_CheckBox-8_1")).click();
		driver.findElement(By.id("RESULT_CheckBox-8_2")).click();
		driver.findElement(By.id("RESULT_CheckBox-8_3")).click();
		driver.findElement(By.id("RESULT_CheckBox-8_4")).click();
		driver.findElement(By.id("RESULT_CheckBox-8_5")).click();
		driver.findElement(By.id("RESULT_CheckBox-8_6")).click();
		
		
		// now go to Text Area ,this area we use sendkeys() action for write into text in teaxarea 
		driver.findElement(By.id("RESULT_TextArea-11")).sendKeys(" this is automation testing fill up the free text massages in this text area ");
		
		
		//now go to link ,linkText ,use click action to select of this element ,copy linkText ---"Flight Reservation" from inspection page 
		if(driver.findElement(By.linkText("Flight Reservation")).isDisplayed()==true);
		driver.findElement(By.linkText("Flight Reservation")).click();// go to NewTour  website 
		
		//back to home page we use 
		driver.navigate().back();//come back from newtour webpage to home page https://goo.gl/kNZ6Sr
		
		//click Submit button 
		
		driver.findElement(By.xpath("//*[@id=\"FSsubmit\"]")).click();
		
		if(driver.getTitle()=="Succesful Submission/Formsite")
		{
			
			System.out.println("Test is Passed");
		}
	}

}
