package service;

import database.DBConnection;
import util.Validation;

import java.sql.*;
import java.util.Scanner;

public class EmployeeService {

    Scanner sc = new Scanner(System.in);

    // ADD EMPLOYEE
    public void addEmployee() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            if (!Validation.isValidEmail(email)) {

                System.out.println("Invalid Email!");

                return;
            }

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            String query =
                    "INSERT INTO employees(name,email,department,salary) VALUES(?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, dept);
            ps.setDouble(4, salary);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println(
                        "Employee Added Successfully!");
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // VIEW EMPLOYEES
    public void viewEmployees() {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM employees");

            System.out.println("\n===== EMPLOYEE LIST =====");

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email") + " | " +
                        rs.getString("department") + " | " +
                        rs.getDouble("salary")
                );
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // SEARCH BY ID
    public void searchEmployee() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Employee ID: ");

            int id = sc.nextInt();

            String query =
                    "SELECT * FROM employees WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email") + " | " +
                        rs.getString("department") + " | " +
                        rs.getDouble("salary")
                );

            } else {

                System.out.println("Employee Not Found!");
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // UPDATE
    public void updateEmployee() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Name: ");
            String name = sc.nextLine();

            System.out.print("Enter New Email: ");
            String email = sc.nextLine();

            if (!Validation.isValidEmail(email)) {

                System.out.println("Invalid Email!");

                return;
            }

            System.out.print("Enter New Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter New Salary: ");
            double salary = sc.nextDouble();

            String query =
                    "UPDATE employees SET name=?,email=?,department=?,salary=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, dept);
            ps.setDouble(4, salary);
            ps.setInt(5, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println("Employee Updated!");

            } else {

                System.out.println("Employee Not Found!");
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteEmployee() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print("Enter Employee ID: ");

            int id = sc.nextInt();

            String query =
                    "DELETE FROM employees WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {

                System.out.println("Employee Deleted!");

            } else {

                System.out.println("Employee Not Found!");
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // SEARCH BY DEPARTMENT
    public void searchByDepartment() {

        try {

            Connection con = DBConnection.getConnection();

            sc.nextLine();

            System.out.print("Enter Department: ");

            String dept = sc.nextLine();

            String query =
                    "SELECT * FROM employees WHERE department=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setString(1, dept);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email") + " | " +
                        rs.getDouble("salary")
                );
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    // SALARY FILTER
    public void salaryFilter() {

        try {

            Connection con = DBConnection.getConnection();

            System.out.print(
                    "Enter Minimum Salary: ");

            double salary = sc.nextDouble();

            String query =
                    "SELECT * FROM employees WHERE salary>=?";

            PreparedStatement ps =
                    con.prepareStatement(query);

            ps.setDouble(1, salary);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("department") + " | " +
                        rs.getDouble("salary")
                );
            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}