import java.util.Scanner;

public class Even{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        // Check if the number is even or odd
        if(number % 2 == 0){
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
        in.close();
      }
    }