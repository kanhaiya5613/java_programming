import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) {
        Float Principle_amount = 0f;
        Float rateOfInterest = 0f;
        int numberOfYears = 0;

        try {
            // Use BufferedReader for reading input
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter the amount: ");
            String tempString = in.readLine();
            Principle_amount = Float.valueOf(tempString);

            System.out.println("Enter the rate of interest: ");
            tempString = in.readLine();
            rateOfInterest = Float.valueOf(tempString);

            System.out.println("Enter number of years: ");
            tempString = in.readLine();
            numberOfYears = Integer.parseInt(tempString);

            // Calculate total interest
            float interestTotal = (Principle_amount * rateOfInterest * numberOfYears)/100;
            System.out.println("The total interest is: " + interestTotal);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}

