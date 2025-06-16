package model;

public class CatAbstractClassModel extends AnimalAbstractClassModel {
    @Override
    public void makeSound() {
        System.out.println("I'm a cat");
    }
}
