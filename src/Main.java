import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println("\n===== Employee DB App =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Department: ");
                    String dept = sc.nextLine();
                    System.out.print("Salary: ");
                    double salary = sc.nextDouble();
                    dao.addEmployee(new Employee(0, name, dept, salary));
                    break;
                case 2:
                    List<Employee> list = dao.getAllEmployees();
                    System.out.println("\n-- Employee List --");
                    for (Employee e : list)
                        System.out.println(e);
                    break;
                case 3:
                    System.out.print("ID to update: ");
                    int id = sc.nextInt(); sc.nextLine();
                    System.out.print("New Name: ");
                    name = sc.nextLine();
                    System.out.print("New Department: ");
                    dept = sc.nextLine();
                    System.out.print("New Salary: ");
                    salary = sc.nextDouble();
                    dao.updateEmployee(new Employee(id, name, dept, salary));
                    break;
                case 4:
                    System.out.print("ID to delete: ");
                    id = sc.nextInt();
                    dao.deleteEmployee(id);
                    break;
                case 5:
                    System.out.println("👋 Goodbye!");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
