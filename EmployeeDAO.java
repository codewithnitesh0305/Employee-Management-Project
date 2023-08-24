import java.sql.*;
import java.util.ArrayList;

public class EmployeeDAO {
    public static void createEmployee(Employee employee) throws SQLException {
        Connection connection = DBconnection.Connection();
        String query = Query.insert;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,employee.getEmployeeId());
        preparedStatement.setString(2,employee.getEmployeeName());
        preparedStatement.setString(3,employee.getEmployeeEmail());
        preparedStatement.setInt(4,employee.getEmployeeSalary());

//        System.out.println("/n ps = "+preparedStatement + employee);
        System.out.println("Data Insert Successfully");
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    public static void updateEmployee(int id, String name) throws SQLException{
        Connection connection = DBconnection.Connection();
        String query = Query.update;

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1,name);
        preparedStatement.setInt(2,id);
        System.out.println("Data Update Successfully");
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }
    public static ArrayList<Employee> readAllEmployee() throws SQLException{
        ArrayList<Employee> emplist = new ArrayList<Employee>();
        Connection connection = DBconnection.Connection();
        String query = Query.read;
        Statement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()){
            Employee employee = new Employee(resultSet.getInt(1), resultSet.getString(2),resultSet.getString(3), resultSet.getInt(4));
            emplist.add(employee);
        }
        statement.close();
        return emplist;
    }
    public  static void deleteEmployee(int id) throws SQLException{
        Connection connection = DBconnection.Connection();
        String query = Query.delete;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1,id);
        System.out.println("Data Delete Successfully");
        preparedStatement.execute();
        preparedStatement.close();
    }

}
