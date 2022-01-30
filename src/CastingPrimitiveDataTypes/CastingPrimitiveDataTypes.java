package src.CastingPrimitiveDataTypes;

public class CastingPrimitiveDataTypes {
    public static void main(String[] args) {

        byte w = 1;        //  Примитивное целое число занимает 1 байт  (-128 .. 127)
        short e = 2;       //  Примитивное целое число занимает 2 байта (-32,768 .. 32,767)
        int q = 123;       //  Примитивное целое число занимает 4 байта (-2*10^9 .. 2*10^9)
        long r = 66;       //  Примитивное целое число занимает 8 байт  (-9*10^18 .. 9*10^18)

        float t = 33.5f;   //  Примитивное дробное число занимает 4 байт  (-10^38 .. 10^38)
        double y = 33.3;   //  Примитивное дробное число занимает 8 байт  (-10^38 .. 10^38)

        boolean b = true;  //  Логический тип 1 байт (только true & false)

        char с = '\u0000'; //  Юникод 2 байта


    }
}

class Convert {
    void toConvert (){
        int a = 123;
        long l = a;       // неявное приведение
        int x = (int) l;  // явное приведение

        double d = 123.5;
        float f = (float)d ;

        int v = (int)d;

        int z = (int) Math.round(4.5);// округление числа до целого
        int u = (int) Math.ceil(4.1); // округление числа до целого вверх
        int y = (int) 4.9;            // округление числа до целого вниз

    }
}
