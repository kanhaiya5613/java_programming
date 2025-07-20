abstract class Base{
abstract void fun();
}
class Derived extends Base{
void fun() { System.out.println("Derived Function is Called" );
}
}
class Abstract{
public static void main(String args[]){
Base B = new Derived();
B.fun();
}
}