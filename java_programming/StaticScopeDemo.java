public class StaticScopeDemo {
    static int x = 5;
    public static void main(String[] args) {
        int x=10;
        {
             x=15;
            System.out.println(x);
        }
    }
    
}
