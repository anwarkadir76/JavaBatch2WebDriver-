package selenium.JDBC.Basictests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDBCExempale2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		
		
		// step 1 , Create the Connection String,import Connection class from java.sql package, only JDBC.jar provide this ,
				//by using Connection class object create Connection
				
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl", "hr","hr");
				
				
				// Step2 ,Create the Statment Class object ,import Statment Class from   java.sql too 
				
				Statement   stmt=con.createStatement();
				
				
				//Step3 .Execute the  sql statment 
				
				String  s= "insert   into  users  values(102,  'mercury2', 'mercury2')";
				
				stmt.execute(s);
				
				//step4  
				
				ResultSet  rs=stmt.executeQuery(s);
				
				while(rs.next())
				{
					
					String  username=rs.getString("uname");
					String  password=rs.getString("passwrd");
					
					
					driver.findElement(By.name("userName")).sendKeys("username");
					driver.findElement(By.name("password")).sendKeys("password");
					driver.findElement(By.name("login")).click();
					
					
					if(driver.getTitle().equals("Find a Flight: Mercurry Tours:"));
					{
						System.out.println("Test  Case Passed");
					}
					
					
				}
				
				//Step5  close the Connection 
				
				con.close();
				
				System.out.println("Program is executed ");
				
				
				//
	}

}



//http://way2automation.com/protractor-angularjs-practice-website.html
//http://www.way2automation.com/
//http://way2automation.com/way2auto_jquery/index.php
