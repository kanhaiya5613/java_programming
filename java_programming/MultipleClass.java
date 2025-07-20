
class circle{
    double x,y;
    double r;
    double circumference(){
        return 2*3.14159*r;
    }
    double area(){
        return (22/7)*r*r;
    }
}
class Box{
    double height;
    double width;
    double depth;
    double area(){
        double a=(width*height+height*depth+width*depth)*2;
        return a;
    }
    double volume(){
        double v;
        v=width*height*depth;
        return v;
    }
}
  class MultipleClass {
    public static void main(String[] args){
        circle c = new circle();
        c.x=0.0;
        c.y=0.0;
        c.r=5.0;
        Box b=new Box();
        b.depth=5.5;
        b.height=6.6;
        b.width=7.7;
        System.out.println("Area "+b.area());
        System.out.println("Volume"+b.volume());
        System.out.println("circumference"+c.circumference());
        System.out.println("Area"+c.area());
    }
}
