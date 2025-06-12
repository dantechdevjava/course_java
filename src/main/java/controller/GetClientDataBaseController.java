package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetClientDataBaseController {
    public static void getClient() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String query = "SELECT * FROM client";

        try {
            connection = GetConnectionDataBaseController.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");

                System.out.println("id: " + id + "\tname: " + name + "\tsurname: " + surname + "\temail: " + email + "\tphone: " + phone);
            }
        } catch (Exception e) {
            System.out.println("Error getting client data");
        } finally {
            try{
                if (connection != null) connection.close();
                if (statement != null) statement.close();
                if (resultSet != null) resultSet.close();
            } catch (Exception e) {
                System.out.println("Error closing resources" + e.getMessage());
            }
        }
    }
}
