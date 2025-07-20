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
  class Class2 {
    public static void main(String[] args){
        circle c = new circle();
        c.x=0.0;
        c.y=0.0;
        c.r=5.0;
        circle c1 = new circle();
        c1.r=9.0;
        c1.x=3.0;
        c1.y=2.0;
        System.out.println("circumference"+c.circumference());
        System.out.println("Area"+c.area());
        System.out.println("circumference"+c1.circumference());
        System.out.println("Area"+c1.area());
    }
}