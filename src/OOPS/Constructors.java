package OOPS;
import java.util.*; //package

class Animal{
    int legs;
    String name;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.legs);
    }
    Animal(String name, int legs){   //parameterized constructor
        this.name = name;
        this.legs = legs;
    }
    Animal(){  //Non Parameterized constructor : it is only defined by user
        System.out.println("A Dog is Barking");
    }
    Animal(Animal S2){ //copy Constructor
        this.name = S2.name;
        this.legs = S2.legs;
    }
}
public class Constructors {
    public static void main(String args[]){
        Animal animal = new Animal("Dog",4);
        Animal animal1 = new Animal();
        animal1.name = "Elephant";
        animal1.legs = 4;
        Animal animal2 = new Animal(animal1);
        System.out.println("A"+" "+animal.name+" "+"has"+" "+animal.legs+" "+"legs");
        animal2.printInfo();

    }
}

//Constructor : it is use to construct the object of java
//Types : Non-parameterized Constructor(Default Constructor) , Parameterized Constructor and Copy Constructor.
//Name of constructor and the Name of the class are Same
//No return data type
//They are function or method
//Calling one time for one object