package selenium.datadriventests.basictest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegstrationTest {

	private static final CharSequence Address = null;
	private static final String ConfirmPassword = null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.gecko.driver","C:\\Program Files\\geckodriver.exe");// open browser
		WebDriver driver=new FirefoxDriver();//open gecko  driver
		
		driver.get("http://newtours.demoaut.com/");// open Url newtours
		
		// getting data from excel sheet 
		FileInputStream  file=new FileInputStream("C:\\Program Files\\ECLIPS\\Excel sheet\\Registration.xlsx");
		
		// get the workbook  instance for XlS file 
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		//get the first sheet from the workbook
		
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		//get first row from the sheet 
         int noOfRows=sheet.getLastRowNum();
         
         System.out.println("No. of Records in the Excel Sheet:" + noOfRows);
         
         
         for(int  row=1; row<=noOfRows;  row++) {
        	 
        	 XSSFRow  current_row=sheet.getRow(row);
        	 
        	 
        	 String  First_name=current_row.getCell(0).getStringCellValue();
        	 String  Last_name=current_row.getCell(1).getStringCellValue();
        	 String  Phone=current_row.getCell(2).getStringCellValue();
        	 String  Email=current_row.getCell(3).getStringCellValue();
        	 String  Adress=current_row.getCell(4).getStringCellValue();
        	 String  City=current_row.getCell(5).getStringCellValue();
        	 String  State=current_row.getCell(6).getStringCellValue();
        	 String  PinCode=current_row.getCell(7).getStringCellValue();
        	 String  Country=current_row.getCell(8).getStringCellValue();
        	 String  UserName=current_row.getCell(9).getStringCellValue();
        	 String  Password=current_row.getCell(10).getStringCellValue();
        	 
        	 //Register process
        	 
        	 driver.findElement(By.linkText("REGISTER")).click();
        	 
        	 //Entering contact information at page http://newtours.demoaut.com/mercuryregister.php?osCsid=b25096be1acab5b3f03b8ec714b10e28
        	 driver.findElement(By.name("firstName")).sendKeys(First_name);
        	 driver.findElement(By.name("lastName")).sendKeys(Last_name);
        	 driver.findElement(By.name("phone")).sendKeys(Phone);
        	 driver.findElement(By.name("userName")).sendKeys(Email);
        	 
        	  //Entering Mailing Information at page http://newtours.demoaut.com/mercuryregister.php?osCsid=b25096be1acab5b3f03b8ec714b10e28
        driver.findElement(By.name("address1")).sendKeys(Address);
        driver.findElement(By.name("address2")).sendKeys(Address);
        driver.findElement(By.name("city")).sendKeys(City);
        driver.findElement(By.name("state")).sendKeys(State);
        driver.findElement(By.name("postalCode")).sendKeys(PinCode);
        
        //Country selected at page http://newtours.demoaut.com/mercuryregister.php?osCsid=b25096be1acab5b3f03b8ec714b10e28
        Select dropcountry=new Select(driver.findElement(By.name("country")));
        
        dropcountry.selectByVisibleText(Country);
        
        //Entering user information at page http://newtours.demoaut.com/mercuryregister.php?osCsid=b25096be1acab5b3f03b8ec714b10e28
        
    driver.findElement(By.name("email")).sendKeys(UserName);
    driver.findElement(By.name("password")).sendKeys(Password);
    
    
    
    //submitting form 
    
    driver.findElement(By.name("register")).click();
    
    if(driver.getPageSource().contains("Thank you for registration")) {
    	System.out.println("Registration Xompleted for " + row + "record");
    }
    else {
    	
    	System.out.println("Registration failed for " + row + "record");
    	
    	
    	//driver.close();
    } 
         }
	}

}
