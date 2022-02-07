package src.AbstractClasses;

public class Cat implements AbleToMakeSound,AnotherSomeKindOfAble{

    @Override
    public void makeSound() {
        System.out.println("meooow");

    }
    @Override
    public void dontMakeSound(){
        System.out.println("silence");
    }
    @Override
    public void just4test(){
        System.out.println("Just for test");
    }


}


