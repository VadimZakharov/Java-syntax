package src.AbstractClasses;
// ключевое слово является
// этот класс концепция, нельзя создать объект этого класса,  нужно наследоваться (не сущность)
// ножно для иерархии классов
// только в абстрактных классах можно создать абстрактный метод, абстрактный метод не может иметь тело
// наследоваться можно только от одного абстрактного класса


public abstract class  Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
    public abstract void makeSound();
    public abstract void dontMakeSound();


}
