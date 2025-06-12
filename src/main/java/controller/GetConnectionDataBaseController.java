package controller;

import model.PathsModel;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnectionDataBaseController {
    public static Connection getConnection() {
        Connection connection = null;

        String password = PathsModel.URL_DATABASE;
        String username = PathsModel.USER_DATABASE;
        String database = PathsModel.PASSWORD_DATABASE;

        try{
            connection = DriverManager.getConnection(password, username, database);
        } catch (Exception e) {
            System.out.println("Error in getting connection");
        }
        return connection;
    }
}
