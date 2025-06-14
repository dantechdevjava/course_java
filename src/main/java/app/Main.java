package app;

import controller.GetClientDataBaseController;
import controller.GetConnectionDataBaseController;
import controller.InsertClientDataBaseController;
import controller.UpdateClientDataBaseController;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection connection = GetConnectionDataBaseController.getConnection();

        if (connection != null) {
            System.out.println("Connection Successful");
        }

        //InsertClientDataBaseController.insertClient();
        UpdateClientDataBaseController.updateClient();
        GetClientDataBaseController.getClient();
    }
}
