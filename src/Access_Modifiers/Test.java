package Access_Modifiers;

import Access_Modifiers.Package1.Person;

public class Test extends Person {
    public int id;     // доступ в любом другом классе и в любом пакете
    private int id2;   // только в пределах класса, где это поле дикларированно
    int id3;           // модификатор доступа в пределах пакета
    protected int id4; // доступ в пределах одного пакета, доступен всем подклассам, даже если эти классы вне пакета,
                       // где эти поля или методы были дикларированы при условии, что он наследуется


public Test(){
    name = "Va" + "Dia";
    }

}

