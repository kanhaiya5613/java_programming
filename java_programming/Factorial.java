public class Factorial{
    int n;
    int factorial(int n){
        if(n == 0 || n == 1) return 1;
        else return (n * factorial(n-1));
    }
    public static void main(String[] args){
       Factorial x = new Factorial();
       x.n = Integer.parseInt(args[0]);
       System.out.println("Factorial of " + x.n + " is " + x.factorial(x.n));
    }
}