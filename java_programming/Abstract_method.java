
abstract class Base {
    
    void fun() {
        System.out.println("Base Constructor is Called!");
    }
    
}

class Derived extends Base {
    Derived() {
        // Calling the superclass constructor
        //super();
        System.out.println("Derived Constructor is Called");
    }

    void fun() {
	super.fun();
        System.out.println("Derived Function is Called");
    }
}

 class Abstract_method {
    public static void main(String[] args) {
        Derived B = new Derived(); // This will call the constructors of both Base and Derived
        B.fun(); // This will invoke the fun method from Derived class
    }
}
