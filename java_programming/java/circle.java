class Circle{
    double x,y,r;
    Circle(double x, double y, double r){
       this.x=x;
       this.y=y;
       this.r=r;
    }
    public static class Point{
        double x,y;
        void Display(){
            System.out.println("(x,y): (" + this.x + " " + this.y + ")");
        }
        Point(double a,double b){
            this.x=a;
            this.y=b;
        }
    } 
    public Boolean isInside(Point p){
        double dx = p.x -x;
        double dy = p.y -y;
        double distance = Math.sqrt(dx*dx)+(dy*dy);
        if(distance < r) return true;
        else return false;
    }
    public static void main(String args[]){
        Circle a = new Circle(0.0,0.0,2.0);
        Point pa = new Point(1.0,2.0);
        pa.Display();
        System.out.println("is the point (1,2) inside the circle with radius 2 :" + a.isInside(pa) );
        Circle b = new Circle(0.0,0.0,1.0);
        Point pb = new Point (3.0,3.0);
        System.out.println("is the point (3,3) inside " + b.isInside(pb));
    }
}