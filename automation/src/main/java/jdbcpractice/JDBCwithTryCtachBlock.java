package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCwithTryCtachBlock {

	public static void main(String[] args) throws SQLException
	{
		//Load the database driver
		Driver driver;
		Connection connection=null;
		try {
			driver=new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_info", "root", "root");
			Statement statement = connection.createStatement();
			//Register the driver
			 
			//Establish the connection
			//create a statement
			
			//Execute the statement
			int result=statement.executeUpdate("delete from students where RegNum=4");
		             
			ResultSet select = statement.executeQuery("select * from students");
			while(select.next()) {
				System.out.println(select.getString(1)+"\t"+select.getString(2)+"\t"+select.getString(3));
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		finally {
			connection.close();
			System.out.println("connection closed");
			
			
		}
		
		

	}

}
