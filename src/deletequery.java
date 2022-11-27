import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class deletequery {
  public static void main(String[] args) throws SQLException {
        
    String url = "jdbc:mysql://localhost:3306/emp";
    String username = "root";
    String password = "123456";

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con = DriverManager.getConnection(url, username, password);
      Statement stmt=con.createStatement();
     
      int result=stmt.executeUpdate("delete from employee where name='vaishali'"); 
      System.out.println(result+" records affected");  
      con.close();

    } catch (SQLException | ClassNotFoundException ex) {
        throw new Error("Error ", ex);
    } 
  }
}

