package OOPS;

class Staticclass{
    String Name;
    static String school;
}
public class Static {
    public static void main(String[] args) {
        Staticclass.school = "St.Xaviers";
        Staticclass student1 = new Staticclass();
        student1.Name = "Harsh";
        System.out.println(student1.Name+" "+student1.school); // it helps me to  do not to enter the school name again and again for every students.
    }
}

//Static : It is accessible for all , and memory given to static only one time , it is used in 4 ways :
//     1) Use in properties
//     2) Use in function
//     3) Use in block
//     4) Use in nested class

//Object ----------------> Memory is given again and again