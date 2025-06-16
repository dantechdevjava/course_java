package app;

import controller.*;
import model.AnimalAbstractClassModel;
import model.CatAbstractClassModel;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // Abstract classes implements
        AnimalAbstractClassModel animalOne = new CatAbstractClassModel();
        animalOne.makeSound();

//        Connection connection = GetConnectionDataBaseController.getConnection();
//
//        if (connection != null) {
//            System.out.println("Connection Successful");
//        }
//        InsertClientDataBaseController.insertClient();
//
//        UpdateClientDataBaseController.updateClient();
//
//        GetClientDataBaseController.getClient();
//
//        DeleteClientDataBaseController.deleteClient();
    }
}
