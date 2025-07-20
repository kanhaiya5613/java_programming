package Demonstration;

class Circle{
    double x,y;
    double r;
    double circumference(){
        return 2*3.14159*r;
    }
    double area(){
        return Math.PI*r*r;
    }
    Circle(double a,double b,double c){
        x=a;
        y=b;
        r=c;
    }
    void printCircleProperties(){
        System.out.println("Center of Circle: ("+x+", "+y+")");
        System.out.println("Radius of Circle: "+r);
        System.out.println("Circumference of Circle: "+circumference());
        System.out.println("Area of Circle: "+area());
    }
}
class Box{
    double height;
    double width;
    double depth;
    Box(double a, double b, double c){
        height = a;
        width = b;
        depth = c;
    }
    double area(){
        double a=(width*height+height*depth+width*depth)*2;
        return a;
    }
    double volume(){
        double v;
        v=width*height*depth;
        return v;
    }
    void printBoxProperties(){
        System.out.println("Height of Box: "+height);
        System.out.println("Width of Box: "+width);
        System.out.println("Depth of Box: "+depth);
        System.out.println("Area of Box: "+area());
        System.out.println("Volume of Box: "+volume());
    }
}
class Constructor {
    public static void main(String[] args){
        Circle c = new Circle(0.0,9.9,8.8);
        c.printCircleProperties();
        
        Box b=new Box(6.6, 7.7, 5.5);
        b.printBoxProperties();
    }
}