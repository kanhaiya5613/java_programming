import java.util.Scanner;
public class Quitioent{
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
	   //code for quotient and remainder
int z=x/y;
System.out.println("The Quotient is = "+ z);
int a=x%y;
System.out.print("The Remainder is = "+ a);
sc.close();
  }
}