package src.Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bibo","ama Bibo",28);
        Person person2 = new Person(2, "Bobo","ama Bobo",29);

        Person [] people = {new Person(3,"Johatan","ama Jonan pohantan",30),
                            new Person(4,"Tonatan","ama Tonatan shonatab",31) };

        // try with resources поток закроется сам
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/Serialization/people.bin"))) {

            FileOutputStream fos1 = new FileOutputStream("src/Serialization/ArrayPeople.bin");
            ObjectOutputStream oos1 = new ObjectOutputStream(fos1);

          /*  oos1.writeInt(people.length); // запись массива поочерёдно

            for (Person person : people){
                oos1.writeObject(person);
            } */
            oos1.writeObject(people); // запись массива целиком

            oos.writeObject(person1);
            oos.writeObject(person2);


            oos1.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}