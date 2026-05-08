package auth;

import java.util.Scanner;

public class AdminLogin {

    private final String USERNAME = "admin";

    private final String PASSWORD = "admin123";

    public boolean login() {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ADMIN LOGIN =====");

        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (username.equals(USERNAME)
                && password.equals(PASSWORD)) {

            System.out.println("Login Successful!\n");

            return true;

        } else {

            System.out.println("Invalid Credentials!");

            return false;
        }
    }
}