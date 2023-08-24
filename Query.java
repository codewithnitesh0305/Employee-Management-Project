public class Query {
    static String insert = "INSERT INTO employee(Id,Name,Email,Salary) VALUES(?,?,?,?)";
    static String update = "UPDATE employee SET Name = ? WHERE Id = ?";
    static String delete = "DELETE FROM employee WHERE Id = ?";
    static String read = "SELECT * FROM employee";
}
