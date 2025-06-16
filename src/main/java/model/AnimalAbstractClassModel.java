package model;

public abstract class AnimalAbstractClassModel {
    // Abstract classes cannot be instantiated directly.
    // The abstract classes can have constructors, abstract methods and not abstract methods

    // Abstract methods cannot have implementations. Subclasses must implement them.
    public abstract void makeSound();

    // Method no abstract
    public void sleep(){
        System.out.println("Sleeping");
    }
}
