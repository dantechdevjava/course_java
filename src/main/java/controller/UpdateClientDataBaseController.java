package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateClientDataBaseController {
    public static void updateClient() {
        Scanner scanner = new Scanner(System.in);

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String sql = "update clients set name=?, surname=?, email=?, telephone=? where id=?";

        try {
            connection = GetConnectionDataBaseController.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            System.out.println("Enter id of the client you want to update:");
            int id = scanner.nextInt();

            System.out.println("Enter name of the client you want to update:");
            String name = scanner.next();
            System.out.println("Enter surname of the client you want to update:");
            String surname = scanner.next();
            System.out.println("Enter email of the client you want to update:");
            String email = scanner.next();
            System.out.println("Enter telephone of the client you want to update:");
            String telephone = scanner.next();

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, surname);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, telephone);
            preparedStatement.setInt(5, id);

            int rtdo = preparedStatement.executeUpdate();
            if (rtdo > 0) {
                System.out.println("The client has been updated successfully!");
            }
        } catch (Exception e) {
            System.out.println("Error update client: " + e.getMessage());
        } finally {
            try {
                if (connection != null) connection.close();
                if (preparedStatement != null) preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
