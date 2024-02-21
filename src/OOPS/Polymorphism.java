package OOPS;
import java.util.*;

class Scholar{
    String name;
    int coursecode;
    public void ScholarInfo(String name){
        System.out.println(name);
    }
    public void ScholarInfo(int coursecode){
        System.out.println(coursecode);
    }
    public void ScholarInfo(String name , int coursecode){
        System.out.println(name+" "+coursecode);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Scholar S1 = new Scholar();
        S1.name = "Harsh";
        S1.coursecode = 456;
        S1.ScholarInfo(S1.name);
        S1.ScholarInfo(S1.coursecode);
        S1.ScholarInfo(S1.name,S1.coursecode);


        //or
//        Namedet.ScholarInfo("Harsh");
//        Scholar Coursedet = new Scholar();
//        Coursedet.ScholarInfo(567);
//        Scholar det = new Scholar();
//        det.ScholarInfo("Siddharth",456);

    }
}

//PolyMorphism : As the name suggest poly(many)+morphism(work) mean different work , if we create different
//               function having same name in the same class is Known as Polymorphism.
// There are two types of PolyMorphism :
//  Function Overloading(Compile time polymorphism)
//  Function Overriding(Run time polymorphism)

// Function overloading : if we create different function having same name in the same class is Known;
     //Rules to follow : Something different in every function :
                // Like : Returntype , parameterType , No.of parameters
