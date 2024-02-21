package OOPS;

abstract class Insects{
    abstract void Fly();
}
class Butterfly extends Insects{
    public void Fly(){
        System.out.println("Butterfly is flying in the sky");
    }
}
class Honeybee extends Insects{
    public void Fly(){
        System.out.println("Honeybee is flying in the sky");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Butterfly butterfly = new Butterfly();
        butterfly.Fly();
        // Insects insects = new Insects(); there is no instance due to abstract class
    }
}

//Abstraction : Data hiding is the process of protecting members of class from avoiding unintended changes, where as
//              Abstraction is use to hiding the implementation details and showing only the important and usefull parts
//              to the user.
// >> it cannot be instantiated(no intence );
// >> it can have constructor and static methods;
