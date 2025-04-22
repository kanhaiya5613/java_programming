class Finally {
    public static void main(String[] args) {
        int i = 0;
        String greetings[] = {"Hello Twinkle !", "Hello Jon !", "Hello Json !"};
        
        while (i < 4) {
            try {
                System.out.println(greetings[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception caught: " + e.toString());
                break; // Exit the loop if an exception occurs
            } finally {
                System.out.println("Hi !");
                if (i >= 3) {
                    System.out.println("You should Quit Now");
                }
            }
        }
    }
}