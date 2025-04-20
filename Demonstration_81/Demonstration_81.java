import java.lang.*;
class calculator{
double i;
double x;
void p(){
x = Math.sqrt(i);
}
}
class Demonstration_81{
public static void main(String args[]){
calculator a = new calculator();
a.i = 20.0;
a.p();
System.out.println("square root of " + a.i + "is " + a.x);
}
}