package src.Serialization;

import java.io.*;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        // try with resources поток закроется сам
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/Serialization/people.bin"))){

            FileInputStream fis1 = new FileInputStream("src/Serialization/ArrayPeople.bin");
            ObjectInputStream ois1 = new ObjectInputStream(fis1);

            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

           /*  int personCount = ois1.readInt();         // В переменной храниться колличество объектов
                                                         // Конструкция для чтения массива
           Person [] people = new Person[personCount];
            for (int i = 0; i < personCount; i++) {
                people[i] =(Person) ois1.readObject();
            } */

            Person [] people =(Person[]) ois1.readObject();
            System.out.println(person1);
            System.out.println(person2);

            System.out.println(Arrays.toString(people));


        } catch (IOException | ClassNotFoundException e) {

            e.printStackTrace();
        }
        }
    }


