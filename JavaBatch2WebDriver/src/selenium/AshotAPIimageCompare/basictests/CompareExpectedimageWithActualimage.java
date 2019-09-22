package selenium.AshotAPIimageCompare.basictests;

import java.awt.image.BufferedImage;
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
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class CompareExpectedimageWithActualimage {

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


BufferedImage  expectedImage=ImageIO.read(new File("C://logo/twoPLUGS.png"));// this is our expected image in my desktop 

//now find the actual image from web page 

WebElement  logoImageElement=driver.findElement(By.xpath("/html/body/div/header/div/a/img"));

Screenshot  logoImageScreenshot= new AShot().takeScreenshot(driver,logoImageElement);

BufferedImage  actualImage=logoImageScreenshot.getImage();

//Comapre expected image (saved in desktop ),with actual image in webpage 

ImageDiffer  imgDiff=new ImageDiffer();
ImageDiff  diff=imgDiff.makeDiff(expectedImage,  actualImage);








if(diff.hasDiff()==true)
{
System.out.println("Image are not same");	

}
else
{

	System.out.println("Image are same ");
}

	}

}
