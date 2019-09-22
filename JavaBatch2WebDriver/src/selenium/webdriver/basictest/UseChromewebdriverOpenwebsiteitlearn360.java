package selenium.webdriver.basictest;

import org.openqa.selenium.chrome.ChromeDriver;

public class UseChromewebdriverOpenwebsiteitlearn360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.itlearn360.com/");
	}

}