class cat{
void speak(){
System.out.println("meow");
}
}
class petcat extends cat{
void speak(){
System.out.println("meow-meow");
}
}
class magicat extends cat{
static boolean noOne;
void speak(){
if(noOne){
super.speak();
} else {
System.out.println("Hello World");
}
}
}
class Dynemic_Binding{
public static void main(String[] args){
petcat c1 = new petcat();
magicat c2 = new magicat();
c2.noOne=true;
c1.speak();
c2.speak();
c2.noOne=false;
c1.speak();
c2.speak();
}
}