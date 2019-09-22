package selenium.JDBC.Basictests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaDatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
       WebDriver driver=new  ChromeDriver();// open browser 
		
       driver.get("http://hugelearning.com/iframe-practice-page/");
       
       driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);// impilicitywait is always apply  globally i savailable for all  webelements ,which driver is interacting ,directly applyed  by driver 
    
		
		driver.manage().window().maximize();
		
		//switch to frame ,there are three way to handle of the frame 
		
		//driver.switchTo().frame(1);// by index 
		//driver.switchTo().frame("IFrame1");//By id 
		// By xpath ,first storage the webelement in store 
		WebElement  frameXpath=driver.findElement(By.xpath("//*[@id=\"IFrame1\"]"));//first storage the xpath or othe webelement 
		driver.switchTo().frame(frameXpath);
		
		
		System.out.println(driver.switchTo().frame(frameXpath).getTitle());
		
		
		//JDBC  CLASS START HERE 
		
		String connectionString=" jdbc:oracle:thin:@localhost:1521:xe ";//https://docs.oracle.com/cd/B25329_01/doc/appdev.102/b25320/getconn.htm
		
		String username="anwarkadir76@yahoo.com";
		
		String password="Enveruygur2016";
		
		Connection conn=null;
		Statement stmt=null;
		ResultSet  rs=null;
		
		
		//Step1: load the driver for OracleDB
		
		Class.forName("oracle.jdbc.driver.OracleDriver");//throws ClassNotFoundException, SQLException 
		
		//Step2 : Creating  a connection using connection string ,username,password
		conn=DriverManager.getConnection(connectionString,username,password);//throws ClassNotFoundException, SQLException 
		
		//step3:  create the Statment 
	    stmt=conn.createStatement();
		
		//step4:  Execute the Query and store into ResultSet 
		
		rs=stmt.executeQuery("select  * from emp ");
		
		//step5:  iterate over the resultset  and print the output or retried the output from the table 
		
		while(rs.next())
		{
			System.out.println("colmun1:"+ rs.getString(0)  + "colmun2:"+ rs.getString(2)+"colmun3:"+rs.getString("name of the column"));
		}
	}



}

