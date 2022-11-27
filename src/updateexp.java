import java.sql.*;
public class updateexp {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/emp";
		String user="root";
		String pass="123456";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(url,user,pass);  
		PreparedStatement stmt=con.prepareStatement("update employee set name=? where name=?"); 
		stmt.setString(1, "vaishali");
		stmt.setString(2, "Edubridge");
		
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated");  
		
		}
		catch(Exception e){ System.out.println(e);}  
	}  
	

	}


