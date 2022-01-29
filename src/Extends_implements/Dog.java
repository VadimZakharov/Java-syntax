package src.Extends_implements;

import src.Extends_implements.Animal;

public class Dog extends Animal {
    public void bark(){
        System.out.println("Im barking");
    }
    public void eat(){
        System.out.println("Im eating 3 times a day");
    }
    public void showName(){
        this.name = "Dogo";
        System.out.println(name);

    }

}
