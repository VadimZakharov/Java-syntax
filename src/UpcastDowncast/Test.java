package src.UpcastDowncast;

public class Test {
    public static void main(String[] args) {

        //  Upcasting Восходящее преобразованеи (От потомка к родителю)
        Dog dog = new Dog();
        Animal animal = new Dog();

        //  Downcasting Низходящее преобразование (От родителя к потомку)
         Dog dog1 = (Dog) animal;

         Animal a = new Animal();
         Dog dog2 = (Dog) a;

         dog.bark();

    }
}
