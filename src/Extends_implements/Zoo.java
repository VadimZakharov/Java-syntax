package Extends_implements;

import Extends_implements.Animal;
import Extends_implements.Dog;

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
