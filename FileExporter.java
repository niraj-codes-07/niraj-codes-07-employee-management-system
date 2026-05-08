package util;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import database.DBConnection;

public class FileExporter {

    public static void exportEmployees() {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            ResultSet rs =
                    st.executeQuery("SELECT * FROM employees");

            FileWriter writer =
                    new FileWriter("employees.txt");

            writer.write("EMPLOYEE DATA\n\n");

            while (rs.next()) {

                writer.write(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("email") + " | " +
                        rs.getString("department") + " | " +
                        rs.getDouble("salary") + "\n"
                );
            }

            writer.close();

            con.close();

            System.out.println(
                    "Employee data exported successfully!");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}