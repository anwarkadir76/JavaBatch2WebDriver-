package selenium.JDBC.Basictests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc_2 {

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		//JDBC  CLASS START HERE 
		
				//String connectionString=" jdbc:oracle:thin:@localhost:1521:xe ";//https://docs.oracle.com/cd/B25329_01/doc/appdev.102/b25320/getconn.htm
				String connectionString=" http://localhost:9898/phpmyadmin/ ";
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

