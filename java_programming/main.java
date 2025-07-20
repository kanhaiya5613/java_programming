 class parent {
    void Display(){
        System.out.println("parent display");
    }
}
class child extends parent{
    void display(){
        System.out.println("child display");
    }
}
public class main{
    public static void main(String[] args) {
        parent obj = new child();
        obj.Display();
    }
}