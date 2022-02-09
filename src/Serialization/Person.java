package src.Serialization;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 4039047128742123779L; // нужно чтобы помечать состояние класса на текущий момент,
                                                                       // и была возможность прочитать классс после его изменений
    private int id;
    private String userName;
    private transient String anything; // при указание ключевого слова transient строка не будет записываться
                                       // вместо строки будет null
    private transient int age;         // вместо числа будет 0



    public Person(int id, String userName, String anything, int age){
        this.id = id;
        this.userName = userName;
        this.anything = anything;
        this.age = age;


    }
    public String getAnything() {
        return anything;
    }

    public int getAge() {
        return age;
    }
    public int getId(){
        return id;
    }
    public String getUserName(){
        return userName;
    }

    public String toString(){
        return id + " : " + userName + " : " + anything + " : " + age;
    }
}
