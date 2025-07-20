public class demonstration {
    public static void main(String[] args) throws java.io.IOException {
        char choice;
        do { 
            System.out.println("Help on");
            System.out.println("1. if ");
            System.out.println("2. switch");
            System.out.println("3. while");
            System.out.println("4. do-while");
            System.out.println("5. for\n");
            System.out.print("Choose one: ");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');
        System.out.println("\n");
        switch(choice){
            case '1' :
            System.out.println("The if statement");
            break;
            case '2':
            System.out.println("The Switch Condition");
            break;
            case '3':
            System.out.println("The While Statement");
            break;
            case '4':
            System.out.println("The Do-While Condition");
            break;
            case '5':
            System.out.println("The For Condition");
            break;
        }
    }
}