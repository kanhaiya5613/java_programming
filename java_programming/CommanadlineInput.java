import java.util.Scanner;
class Commandlineinput{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("please Enter two number");
        int a = scnr.nextInt();
        int b = scnr.nextInt();
        if(a>b){
            System.out.printf("between %d and %d, maximum is %d\n",a,b,a);
        }
        else{
            System.out.printf("Between %d and %d , %d is maximum",a,b,b);
        }
    }
}
