package selenium.AshotAPIimageCompare.basictests;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

public class CaptureLogoImage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		
		WebDriver driver=new  ChromeDriver();
		
		//Maximise browser window
        driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
    
           //Adding wait 
 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
 
 //get webpage 
driver.get("https://www.twoplugs.com/");// capture the web page image twoPLUGS,and take screenshot

//get Title and print

System.out.println(driver.getTitle());

WebElement  logoImageElement=driver.findElement(By.xpath("/html/body/div/header/div/a/img"));

Screenshot  logoImageScreenshot= new AShot().takeScreenshot(driver,logoImageElement);


ImageIO.write(logoImageScreenshot.getImage(),"png",new File ("C://logo/twoPLUGS.png"));


File  f=new File("C://logo/twoPLUGS.png");

if(f.exists())
{
System.out.println("Image File Capture");	

}
else
{

	System.out.println("Image File not exite ");
}

	}

}
