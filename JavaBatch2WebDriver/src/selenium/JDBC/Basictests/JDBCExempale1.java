package selenium.JDBC.Basictests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExempale1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		
		// step 1 , Create the Connection String,import Connection class from java.sql package, only JDBC.jar provide this ,
		//by using Connection class object create Connection
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/pdborcl", "hr","hr");
		
		
		// Step2 ,Create the Statment Class object ,import Statment Class from   java.sql too 
		
		Statement   stmt=con.createStatement();
		
		
		//Step3 .Execute the  sql statment 
		
		String  s= "insert   into  users  values(102,  'mercury2', 'mercury2')";
		
		stmt.execute(s);
		
		
		
		//Step4  close the Connection 
		
		con.close();
		
		System.out.println("Program is executed ");
		
		
		//
	}

}
