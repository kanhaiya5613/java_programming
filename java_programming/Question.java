class Person{
    int a = 1;
    int b = 0;
    public Person(){
        System.out.println(a + b + "java");
    }
}
class Employee extends Person{
    int a=0;
    int b=1;
    public Employee(){
        System.out.println(a*b+"java");
    }
}
public class Question {
    public static void main(String[] args) {
         Person p = new Employee();
    }
}
