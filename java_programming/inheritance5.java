class A{
int i;
}
class B extends A{
int i;
B(int a,int b){
super.i=a;
i=b;
}
void show(){
System.out.println("The I of SuperClass : " + super.i);
System.out.println("The I of SubClass : " + i);
}
}
class inheritance5{
public static void main(String[] args){
B box = new B(5,6);
box.show();
}
}