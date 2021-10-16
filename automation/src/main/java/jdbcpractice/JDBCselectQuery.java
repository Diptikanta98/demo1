package jdbcpractice;


import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class JDBCselectQuery {

	public static void main(String[] args) throws Throwable {
		//Step1:Load the database driver
		Driver driver = new Driver();
		//Step1:Register the database
		DriverManager.registerDriver(driver);
		
		//Step2:Establish the connection
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql, null, null)"
		
		//Step3: Create a statement
		Statement stmt =connection.createStatement();		

	}

}
