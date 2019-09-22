package selenium.webdriver.basictest;

import org.openqa.selenium.firefox.FirefoxDriver;

public class UseFaifoxwebdriverOpenwebsiteitlearn360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.itlearn360.com/");
		
	}

}