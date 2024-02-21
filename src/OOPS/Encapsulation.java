package OOPS;

class Bank{
    public String name;
    protected int acount;
    private String password;

    //using getter and setter to access or set password
    public String Getpass(){
        return this.password;
    }
    public void Setpass(String password){
        this.password = password;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Bank account1 = new Bank();
        account1.name = "Harsh";
        account1.acount = 1200456789;
        //account1.password = "hags"; //it is due to private access modifier
        account1.Setpass("Harshtrip");
        System.out.println(account1.name+" "+account1.acount);
        System.out.println("Password is : "+account1.Getpass()); //it is possible through getter and setter
    }
}


// Encapsulation : When the data ann there function combined in a single entity.
//types : Package : - Builtin(java.util.*) and UserDefined
//Access Modifiers: It helps to hide important data using - Public , default , protected , private

//Public : member of class is accessibe from any class in the same package or it is also accessible from any class of the other package;
//default : member of class is only accessible from any class in the same package;
//Protected : member of class can be accessible from the any class in the same package and it is only accessible by the child class of the other package;
//Private : member of the class is not accessible form the other class eventough in the same package .
//          If you want to make it accessible you have to create a getter and setter int the same class where the private member belongs;