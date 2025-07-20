package Demonstration;
class point{
    int x,y;
    void setpoint(int a,int b){
        x=a;
        y=b;
    }
}
class setter {
    public static void main(String[] args){
        point p = new point ();
        p.setpoint(5, 9);
    }
}
