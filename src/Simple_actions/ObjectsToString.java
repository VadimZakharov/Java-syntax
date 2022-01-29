package src.Simple_actions;

public class ObjectsToString {
    public static void main(String[] args) {
        Object object = new Object("big",35);
        System.out.println(object);

    }
}
class Object {
    private String room;
    private  int size;
    public String toString(){
        return room + "," + size;
    }

    public Object (String room,int size){
        this.room = room;
        this.size = size;
    }

}