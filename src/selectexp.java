import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
public class selectexp {

	public static void main(String[] args) throws ClassNotFoundException {
		String url="jdbc:mysql://localhost:3306/emp";
		String user="root";
		String pass="123456";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(url,user,pass);  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee");  
		while(rs.next()) 
		System.out.println(rs.getString(1)+"    "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  
		
		}

