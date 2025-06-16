package app;

import controller.*;
import model.AnimalAbstractClassModel;
import model.CatAbstractClassModel;
import model.MethodVarArgsModel;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("IMPLEMENTATION ABSTRACT CLASS MODEL");
        AnimalAbstractClassModel animalOne = new CatAbstractClassModel();
        animalOne.makeSound();

        System.out.println("IMPLEMENTATION METHOD WITH ARGUMENTS");
        MethodVarArgsModel methodOne = new MethodVarArgsModel();
        methodOne.printNumbers(12,13,54,6);

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
