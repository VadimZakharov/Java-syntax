package src.Generics;

public class Animal {

    public void eat(){
        System.out.println("Animal is eating");
    }

    public Animal(){

    }
    private int id;
    public Animal(int id){
        this.id = id;
    }
    public String toString(){
        return String.valueOf(id);
    }
}
