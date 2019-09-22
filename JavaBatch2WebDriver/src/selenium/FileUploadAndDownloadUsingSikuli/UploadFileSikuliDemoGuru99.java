package selenium.FileUploadAndDownloadUsingSikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileSikuliDemoGuru99 {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
	        String filepath = "C:\\Program Files\\ECLIPS\\snapshootesforSikuli\\AppleCoumputer.PNG\\";
	        String inputFilePath = "C:\\Program Files\\ECLIPS\\snapshootesforSikuli\\AppleCoumputer.PNG\\";
	        Screen s = new Screen();
	        Pattern fileInputTextBox = new Pattern(filepath + "FileTextBox.PNG");
	        Pattern openButton = new Pattern(filepath + "OpenButton.PNG");
	        WebDriver driver;

	        // Open Chrome browser    
	        driver = new ChromeDriver();
	        driver.get("http://demo.automationtesting.in/Register.html");

	        // Click on Browse button and handle windows pop up using Sikuli
	        driver.findElement(By.xpath("//*[@id=\"imagesrc\"]")).click();
	        s.wait(fileInputTextBox, 20);
	        s.type(fileInputTextBox, inputFilePath + "AppleCoumputer.PNG");
	        s.click(openButton);

	        // Close the browser
	       // driver.close();

	    }


	}


