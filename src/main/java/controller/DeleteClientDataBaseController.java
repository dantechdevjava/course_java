package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteClientDataBaseController {
    public static void deleteClient() {
        Scanner sc = new Scanner(System.in);

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String sql = "DELETE FROM clients WHERE id = ?";

        try {
            connection = GetConnectionDataBaseController.getConnection();
            preparedStatement = connection.prepareStatement(sql);

            System.out.println("Enter the ID of the client you want to delete: ");
            int id = sc.nextInt();

            preparedStatement.setInt(1, id);

            int rtdo = preparedStatement.executeUpdate();
            if (rtdo > 0) {
                System.out.println("The client has been deleted successfully!");
            }
        } catch (Exception e) {
            System.out.println("Delete client failed!");
        }
    }
}
