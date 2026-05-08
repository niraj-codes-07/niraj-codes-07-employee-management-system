package main;

import auth.AdminLogin;
import service.EmployeeService;
import util.FileExporter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AdminLogin login = new AdminLogin();

        if (!login.login()) {

            return;
        }

        Scanner sc = new Scanner(System.in);

        EmployeeService service = new EmployeeService();

        int choice;

        do {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Search By Department");
            System.out.println("7. Salary Filter");
            System.out.println("8. Export To File");
            System.out.println("9. Exit");

            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    service.addEmployee();
                    break;

                case 2:
                    service.viewEmployees();
                    break;

                case 3:
                    service.searchEmployee();
                    break;

                case 4:
                    service.updateEmployee();
                    break;

                case 5:
                    service.deleteEmployee();
                    break;

                case 6:
                    service.searchByDepartment();
                    break;

                case 7:
                    service.salaryFilter();
                    break;

                case 8:
                    FileExporter.exportEmployees();
                    break;

                case 9:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 9);
    }
}