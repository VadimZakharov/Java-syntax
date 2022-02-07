package src.AbstractClasses;

public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("bark");

    }
    @Override
    public void dontMakeSound(){
        System.out.println("silence");
            }
}

