package src.ClassesObjectsMethods;

public class Classes_Objects_Methods {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Anna",18);
        person1.speak();
        int year1 = person1.calculateYearsToRetirement();
        System.out.println("До пенсии мне " + year1 + " лет.");


    }

}
class Person {
    String name;
    int age;


    int calculateYearsToRetirement(){

        int retirement = 65 - age;
        return retirement;
    }
    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " мне " + age + " лет");
        }

            }
    void setName(String username, int userage){
        name = username;
        age = userage;
    }
}



