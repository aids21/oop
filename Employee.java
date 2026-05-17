import java.sql.*;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            Connection cn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employeedb",
                "root",
                "rushi"
            );

            int flag = 1;

            while (flag == 1) {
                System.out.println("\n=== Employee Management System ===");
                System.out.println("1. Add Employee");
                System.out.println("2. Display Employees");
                System.out.println("3. Update Employee");
                System.out.println("4. Delete Employee");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");

                int choice = sc.nextInt();
                int id;
                String name;

                switch (choice) {

                    case 1:
                        System.out.print("Enter Employee ID: ");
                        id = sc.nextInt();

                        System.out.print("Enter Employee Name: ");
                        name = sc.next();

                        PreparedStatement ps1 = cn.prepareStatement(
                            "insert into employees values(?,?)"
                        );
                        ps1.setInt(1, id);
                        ps1.setString(2, name);
                        ps1.executeUpdate();

                        System.out.println("Employee Added Successfully");
                        break;

                    case 2:
                        System.out.println("\nEmployee List");
                        System.out.println("ID\tName");

                        PreparedStatement ps2 = cn.prepareStatement(
                            "select * from employees"
                        );
                        ResultSet rs = ps2.executeQuery();

                        while (rs.next()) {
                            System.out.println(rs.getInt(1) + "\t" + rs.getString(2));
                        }
                        break;

                    case 3:
                        System.out.print("Enter Employee ID to Update: ");
                        id = sc.nextInt();

                        System.out.print("Enter New Name: ");
                        name = sc.next();

                        PreparedStatement ps3 = cn.prepareStatement(
                            "update employees set name=? where id=?"
                        );
                        ps3.setString(1, name);
                        ps3.setInt(2, id);
                        ps3.executeUpdate();

                        System.out.println("Employee Updated Successfully");
                        break;

                    case 4:
                        System.out.print("Enter Employee ID to Delete: ");
                        id = sc.nextInt();

                        PreparedStatement ps4 = cn.prepareStatement(
                            "delete from employees where id=?"
                        );
                        ps4.setInt(1, id);
                        ps4.executeUpdate();

                        System.out.println("Employee Deleted Successfully");
                        break;

                    case 5:
                        flag = 0;
                        System.out.println("Exited Successfully");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }
            }

            cn.close();
            sc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}