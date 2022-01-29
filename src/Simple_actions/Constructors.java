package Simple_actions;

public class Constructors {
    public static void main(String[] args) {
        People people1 = new People("Vadim");
        people1.setName("Vadim");
        people1.setAge(29);

    }
}
    class People {

        private String name;
        private int age;

        public People(){
            System.out.println("Я первый");
        }

        public People(String name){
            System.out.println("Я второй");
        }

        public  People(String name, int age){
            System.out.println("Я третий");
        }

        public void setName(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }
        public int getAge() {
            return age;
        }
    }

