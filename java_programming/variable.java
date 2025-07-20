public class variable {
    int x=30;
    static int y = 20;
    public static void main(String[] args) {
        variable t1 = new variable();
        t1.x=88;
        t1.y=99;
        int z1 = t1.x + t1.y; 
        variable t2= new variable();
        System.out.println(t2.x + " " + t2.y + " " + z1);
    }
}
