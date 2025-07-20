
abstract class Base {
    Base() {
        System.out.println("Base Constructor is Called!");
    }
    
    abstract void fun();
}

class Derived extends Base {
    Derived() {
        // Calling the superclass constructor
        super();
        System.out.println("Derived Constructor is Called");
    }

    void fun() {
        System.out.println("Derived Function is Called");
    }
}

 class Abstract {
    public static void main(String[] args) {
        Derived B = new Derived(); // This will call the constructors of both Base and Derived
        B.fun(); // This will invoke the fun method from Derived class
    }
}
