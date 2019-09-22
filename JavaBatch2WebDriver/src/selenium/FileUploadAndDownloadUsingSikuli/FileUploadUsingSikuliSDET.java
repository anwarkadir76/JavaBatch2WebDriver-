package selenium.FileUploadAndDownloadUsingSikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class FileUploadUsingSikuliSDET {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		// Initiate driver 
    	
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				//Maximise browser window
		        driver.manage().window().maximize();
		       driver.manage().deleteAllCookies();
				
			
		        
		        
		      //Maximise browser window
		        driver.manage().window().maximize();
		     
		           //Adding wait 
		 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		 
						
				//OPEN URL OF APPLICATIONS
						driver.get("http://demo.automationtesting.in/Register.html");// Upload the file from this webpage 
						
		// inspect and click the Choose file button from webpage byy xpath 
						
						
	driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
	
	// Sikuli provide some ofthe veriables
	
String	imagesFilepath = "C:\\Program Files\\ECLIPS\\snapshootesforSikuli\\AppleCoumputer.PNG\\";

String inputFilepath="C:\\Program Files\\ECLIPS\\snapshootesforSikuli\\AppleCoumputer.PNG\\";

Screen  s=new  Screen();// import class import org.sikuli.script.Screen;

//create new one obeject class 

Pattern fileInputTextbox=new Pattern(imagesFilepath +"FileTextBox.PNG");//import org.sikuli.script.Pattern;
Pattern openButton=new Pattern(imagesFilepath +"OpenButton.PNG");//import org.sikuli.script.Pattern;

//waite 

Thread.sleep(5000);// throws InterruptedException

// waite the we click the  choose file button ,three comments 

s.wait(fileInputTextbox,20);//throws FindFailed

s.type(fileInputTextbox,inputFilepath +"AppleCoumputer.PNG");

s.click();




	}

}
