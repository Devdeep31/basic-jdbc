import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
       try{

        
        //connection
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/college", "root", "root"
        );

        //statement
        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("Select * from teachers");

        while (rs.next()){ 
            System.out.println(rs.getString(1)+"  "+ rs.getString(2)+"  "+rs.getString(3));
            con.close();
        }
    }
        
        catch(Exception e){
            System.out.println(e);
       }
    }
}

