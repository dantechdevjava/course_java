package app;

import controller.*;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = GetConnectionDataBaseController.getConnection();

        if (connection != null) {
            System.out.println("Connection Successful");
        }
        //InsertClientDataBaseController.insertClient();

        //UpdateClientDataBaseController.updateClient();

        //GetClientDataBaseController.getClient();

        DeleteClientDataBaseController.deleteClient();
    }
}
