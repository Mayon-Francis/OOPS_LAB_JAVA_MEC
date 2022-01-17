// Interfaces are used
// 1- Multiple inheritance is not supported in java
//      Whereas multiple interfaces can be implemented in a class
// 2- They Sort of make a protocol, or a contract which the implementing class needs to well umm implement

interface Parent1 {
    void printHello();
}

interface Parent2{
    void printGoodDay();
}

public class InterfaceDemo implements Parent1, Parent2{
    @Override
    public void printHello() {
        System.out.println("Hello");
    }
    @Override
    public void printGoodDay() {
        System.out.println("Good Day!");
    }
    public void printHelloWorld()
    {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.printHello();
        obj.printGoodDay();
        obj.printHelloWorld();
    }
}
