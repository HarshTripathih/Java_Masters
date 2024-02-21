package OOPS;


class Buffalow{
    public void eating(){
        System.out.println("Eating grass");
    }
}
class Calf extends Buffalow{
    public void Sleeping(){
        System.out.println("also Sleeping");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Calf bhv = new Calf();
        bhv.eating();
        bhv.Sleeping();
    }
}

//SingleLevel Inheritence : when derived class inherit base class or parent class.
//MultiLevel Inheritance : when 2nd derived clas inherit the properties of 1st derived class and 1st derived class inherit parent class.
//Hierarchial Inheritance : when more than two derived class inherit the properties of one parent class.
//Hybrid Inheritance : anything