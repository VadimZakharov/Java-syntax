package src.Interfaces;

public class Animal implements Info {

    public Animal(int id){
        this.id = id;
    }

    public int id;
    public void sleep (){
        System.out.println("Im sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("ID is " + id);

    }
}
