package model;

public interface AnimalInterfaceModel {
    // Attributes must always be initialized and these are considered as constant
    String NAME = "Snow";
    int WEIGHT = 3;

    // Methods behave like abstract methods
    void makeSound();
    void eat();

    // When an interface is implemented in a class, we are forced to use all the methods of that interface
}
