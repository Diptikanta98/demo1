package jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;



public class jdbcselect {

	public static void main(String[] args) throws SQLException {
	
		Driver driver = new Driver();
	
		DriverManager.registerDriver(driver);
     
		Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
     
		Statement s = connection.createStatement();
    
		ResultSet result = s.executeQuery("select * from student");
    
		while(result.next()) {
    	
			System.out.println(result.getInt(1)+"\t"+result.getString("firstname")+"\t"+result.getString("lastname"));
    	
    	
    }
	
	connection.close();
	
	

	}

}
