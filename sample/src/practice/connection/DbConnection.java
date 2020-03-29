package practice.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbConnection {

	private static Connection conn=null;
	private static Connection connect=null;
	public static Connection getConnction()
	{
		try{


			String driver="com.mysql.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/product";
			String user="root";
			String password="password";
			Class.forName(driver);
			conn=DriverManager.getConnection(url, user, password);
		}
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		connect=DbConnection.getConnction();
		if(connect!=null){
			System.out.println("Connection Stablished");
		}else{
			System.out.println("Connection Failed");
		}
	}

}
