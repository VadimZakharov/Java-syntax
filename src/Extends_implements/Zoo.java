package src.Extends_implements;

import src.Extends_implements.Animal;
import src.Extends_implements.Dog;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        dog.showName();
    }
}
