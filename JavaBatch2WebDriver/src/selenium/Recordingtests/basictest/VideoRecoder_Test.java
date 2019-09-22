package selenium.Recordingtests.basictest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class VideoRecoder_Test {
	WebDriver driver;

	@BeforeClass
	void setup() {
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
	}

	@Test
	void verifyLinks() throws Exception {
		
		VideoRecorder_utlity.startRecord("GoogleTestRecording");//Starting point of video recording
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium");  
		Thread.sleep(3000);
		driver.findElement(By.name("btnK")).click();
                Thread.sleep(3000);
		VideoRecorder_utlity.stopRecord();//End point of video recording
	}

	@AfterClass
	void tearDown()
	{
		driver.close();
	}
}

//https://www.qaautomation.co.in/
//https://www.qaautomation.co.in/2019/06/record-selenium-webdriver-test-monte-screen-recorder.html
