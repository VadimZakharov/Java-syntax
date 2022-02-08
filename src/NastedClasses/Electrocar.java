package src.NastedClasses;

public class Electrocar {
        private int id;

    //Вложенный нестатический класс, прописывается логика подобъекта, обычно private, имеет доступ к полям
        private class Motor {
            public void startMotor(){
                System.out.println("Motor" + id +  "is starting");
            }
        }
    // Вложенный статический класс, нужны для вызова из вне, static, не имеет доступ к полям
    public static class Battary {
            public void charge(){
                System.out.println("Battery is charging");
            }
    }
    public Electrocar (int id){
        this.id = id;
    }
    public void start(){
            Motor motor = new Motor();
            motor.startMotor();

    // Вложенный класс находящийся в методе
            class SomeClass{
                public void someMethod(){

                }
            }
        System.out.println("Electrocar "+ id + " is starting ");
    }
}
