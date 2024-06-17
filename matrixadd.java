import java.util.Scanner;

public class matrixadd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat1[][] = {{1, 1}, {1, 1}};
        int mat2[][] = {{2, 2}, {2, 2}};
        int matsum[][] = new int[2][2];
        int len = mat1.length;
        int i, j;

        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                matsum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // Print the result matrix
        System.out.println("Sum of matrices:");
        for (i = 0; i < len; i++) {
            for (j = 0; j < len; j++) {
                System.out.print(matsum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
