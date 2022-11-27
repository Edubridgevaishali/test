import java.sql.*;  
public class insertexp {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/emp";
		String user="root";
		String pass="123456";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(url,user,pass);  
		PreparedStatement stmt=con.prepareStatement("insert into Employee values(?,?,?,?)"); 
		stmt.setString(1, "Edubridge");
		stmt.setString(2, "Learning");
		stmt.setString(3, "2022-08-12");
		stmt.setString(4, "8");
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		
		}
		catch(Exception e){ System.out.println(e);}  
	}  
	

	}


