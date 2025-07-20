import java.util.*;

public class Volume {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        double height = in.nextDouble();
        // Calculate the volume
 double volume = Math.PI * Math.pow(radius, 2) * height;
 // Display the result
 System.out.printf("Volume is: %.2f", volume);
 in.close();
}
}