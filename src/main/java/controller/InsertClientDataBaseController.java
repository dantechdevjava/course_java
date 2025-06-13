package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertClientDataBaseController {
    public static void insertClient(){
        Scanner sc = new Scanner(System.in);

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String sql = "INSERT INTO clients(id, name, surname, email, telephone) VALUES (?, ?, ?, ?, ?)";
        try {
            connection = GetConnectionDataBaseController.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            System.out.println("Enter ID");
            int id = sc.nextInt();
            System.out.println("Enter name");
            String name = sc.next();
            System.out.println("Enter surname");
            String surname = sc.next();
            System.out.println("Enter email");
            String email = sc.next();
            System.out.println("Enter telephone");
            String telephone = sc.next();

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, name);
            preparedStatement.setString(3, surname);
            preparedStatement.setString(4, email);
            preparedStatement.setString(5, telephone);

            int result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("Inserted successfully");
            }

        } catch (SQLException e) {
            System.out.println("Error in inserting client" + e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Error in closing resources" + e.getMessage());
            }
        }
    }
}
