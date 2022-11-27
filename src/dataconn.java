import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

class dataconn {
  public static void main(String[] args) {
   
    String url = "jdbc:mysql://localhost:3306/emp";
    String username = "root";
    String password = "123456";

    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con = DriverManager.getConnection(url, username, password);

      System.out.println("Connected!");
      con.close();

    } catch (SQLException | ClassNotFoundException ex) {
        throw new Error("Error ", ex);
       
    } 
    }
  }


