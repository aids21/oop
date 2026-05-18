import java.util.Scanner;

class Employee
{
int empId;
String name;
double salary;

Employee(int empId, String name, double salary)
{
this.empId = empId;
this.name = name;
this.salary = salary;
}

void displayEmployee()
{
System.out.println("Employee ID: " + empId);
System.out.println("Employee Name: " + name);
System.out.println("Salary: " + salary);
}
}

class Developer extends Employee
{
String projectName;

Developer(int empId, String name, double salary, String projectName)
{
super(empId, name, salary);
this.projectName = projectName;
}

void displayDeveloper()
{
displayEmployee();
System.out.println("Project Name: " + projectName);
}
}

public class EmployeeDemo
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.print("Enter Employee ID: ");
int id = sc.nextInt();
sc.nextLine();

System.out.print("Enter Employee Name: ");
String name = sc.nextLine();

System.out.print("Enter Salary: ");
double salary = sc.nextDouble();
sc.nextLine();

System.out.print("Enter Project Name: ");
String project = sc.nextLine();

Developer d1 = new Developer(id, name, salary, project);

System.out.println("\n----- Employee Details -----");
d1.displayDeveloper();

sc.close();
}
}