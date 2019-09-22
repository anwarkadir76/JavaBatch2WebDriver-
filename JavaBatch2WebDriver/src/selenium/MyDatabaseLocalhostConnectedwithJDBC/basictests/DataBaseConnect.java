package selenium.MyDatabaseLocalhostConnectedwithJDBC.basictests;

import java.sql.Connection;
import java.sql.*;
public class DataBaseConnect {
	
//validate three verivable to help sql database 
	
	private Connection con;//import java.sql.*; 
	private Statement   st;//import java.sql.*;
	private ResultSet   rs;//import java.sql.*;
	
	//now create the constractor for our class 
	
	public DataBaseConnect( ) {
		
		
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:9898/e-commerice","root","");
		st=con.createStatement();
	
	
	}catch(Exception  ex) {
		
		System.out.println("Erro:" + ex);
	}

	}
	
	public void getData1() {
		
		try {
			String query="select * from customers";
			rs=st.executeQuery(query);
			System.out.println("records from Database");
			
			while(rs.next()) {
				String ID=rs.getString(" CustomerID");
				String name=rs.getString(" CustomerName");
				String contact=rs.getString(" ContactName");
				String address=rs.getString("Address");		
				String postcode=rs.getString("PostalCode");	
				String city=rs.getString(" City");
				String country=rs.getString("Country");		
				String phone=rs.getString("ContactPhone");	
				System.out.println("CustomerID:" +ID+"CustomerName:"+name+ " " );

			}
			
			
		}catch (Exception ex) {
			
			System.out.println(ex);
		}
	}

	public void getData() {
		// TODO Auto-generated method stub
		
	}
}