package OOPS;
import java.util.*;

class Student{
    String Name;
    int RegNo;
    public void Grade(){
        System.out.println("He is a good student");
    }
}
public class ObjectAndClass {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.Name = "Harsh";
        S1.RegNo = 12007942;
        S1.Grade();
        System.out.println(S1.Name+" "+ S1.RegNo);
    }
}

//Object : are the instance of Class, it is a physical entity having : State(Value) , Behaviour(Functionality) ,Identity(uniqueId)
//Class : group of object having common properties, its is a template or blueprint from which objects are created:
//A class Contains : Method , Constructor , Fields , Block ,Nested Class or Interface