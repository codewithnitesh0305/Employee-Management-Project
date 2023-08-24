import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
       while(true){
           System.out.println("Employee Management Project");
           System.out.println("1. Create Employee");
           System.out.println("2. Read Employee");
           System.out.println("3. Update Employee");
           System.out.println("4. Delete Employee");
           System.out.println("5. Exit");

           System.out.println("Enter Your Choice");
           int choice = sc.nextInt();
//            if(choice > 1 || choice <= 5) break;
            switch (choice){
                case 1:
                    System.out.println("Enter Id , Name , Email , Salary");
                    int id = sc.nextInt();
                    sc.nextLine();
                    String name = sc.nextLine();
                    String email = sc.nextLine();
                    int salary = sc.nextInt();
                    Employee emp = new Employee(id,name,email,salary);
                    EmployeeDAO.createEmployee(emp);
                    break;
                case 2:
                    ArrayList<Employee> List = EmployeeDAO.readAllEmployee();
                    for(Employee employee : List){
                        System.out.println(employee);
                    }
                    break;
                case 3:
                    System.out.println("Enter Id and Name");
                     id = sc.nextInt();
                     sc.nextLine();
                     name = sc.nextLine();
                     EmployeeDAO.updateEmployee(id,name);
                     break;
                case 4:
                    System.out.println("Enter Id");
                    id = sc.nextInt();
                    EmployeeDAO.deleteEmployee(id);
                    break;
                case 5:
                    System.out.println("Thank You");
                    System.exit(0);
            }
        }
    }
}



