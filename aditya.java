import java.util.Scanner;

class ditya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5, i, j;

        // Printing the increasing sequence
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Printing the decreasing sequence
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
