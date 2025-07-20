


public class my3Darray {
    public static void main(String[] args) {
        // Declare a 3D array
        int[][][] my3DArray = new int[3][3][3];

        // Initialize the 3D array
        for (int i = 0; i < my3DArray.length; i++) {
            for (int j = 0; j < my3DArray[i].length; j++) {
                for (int k = 0; k < my3DArray[i][j].length; k++) {
                    my3DArray[i][j][k] = i + j + k;
                }
            }
        }

        // Print the 3D array
        for (int i = 0; i < my3DArray.length; i++) {
            for (int j = 0; j < my3DArray[i].length; j++) {
                for (int k = 0; k < my3DArray[i][j].length; k++) {
                    System.out.print(my3DArray[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}