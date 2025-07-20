import java.Child;
import java.Parent;

class Parent {
    String message(){
        return "Parent";
    }
}
class Child extends Parent{
    @Override
    String message(){
        return "child";
    }
}
public class Kanhaiya {
    public static void main(String[] args){
        Parent p = new Child();
        System.out.println(p.message());
    }
}