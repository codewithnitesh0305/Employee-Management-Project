import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    static Connection connection;
    public static Connection Connection(){
        try {
            String url = "jdbc:mysql://localhost:3306/employeedb2";
            String userName = "root";
            String password = "Nitesh@0305";

            connection = DriverManager.getConnection(url,userName,password);
            System.out.println(connection);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }
}
