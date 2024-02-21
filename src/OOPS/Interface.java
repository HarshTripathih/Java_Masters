package OOPS;

interface Plants{
    public void Green();
}
class Tulsi implements Plants{
    @Override
    public void Green() {
        System.out.println("it is anticeptal green plant good for health");
    }
}
class Neem implements Plants{
    @Override
    public void Green() {
        System.out.println("it is anticeptal green plant good for health or to heal cuts");
    }
}
public class Interface {
    public static void main(String[] args) {
        Neem neem = new Neem();
        neem.Green();
        Plants plants = new Neem();
        plants.Green();
    }
}

//Interface : it is used for doing Multiple inheritance because in java , javaClass not allow to do multiple inheritance,
//            So to over come this is possible because of the interface;

//     Base          Base
//       |            |
//       |____________|
//             |
//          Derived

// Interface not allow to create a constructor;
// Not allow to create Non-Abstract funtion
//ALl field by default public , static and final
//All Method are public and static by default.