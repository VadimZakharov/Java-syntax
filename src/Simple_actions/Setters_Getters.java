package Simple_actions;

public class Setters_Getters {

    public static void main(String[] args) {
    Person1 person1 = new Person1();
    person1.setName("Vadim");
    person1.setAge(29);
    person1.speak();
        System.out.println("Выводим имя в get методе " + person1.getName());
        System.out.println("Выводим возраст в get методе " + person1.getAge());

    }
}

class Person1 {
    private String name;
    private int age;

    public void setName(String userName) {
        if (userName.isEmpty()) {
            System.out.println("Ты вёл пускую строку, введи имя");
        } else {
            name = userName;

        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Тебе не может быть меньше 0");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }
    int calculateYearsToRetirement(){
        int years = 65 - age;
        return years;
    }

    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + " Im " + age + " yers old");

        }
    }
}