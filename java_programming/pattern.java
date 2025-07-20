import java.util.*;
public class pattern{
    public static void main(String[] args) {
    try (Scanner inr = new Scanner(System.in)) {
        int n = inr.nextInt();
        // Add the necessary code in the below space
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }

        // Print the ascending part of the pattern
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
    }
}
