import java.util.Scanner;

public class lst {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = 45;
        int u = 49;
        int x = 0;
        int a[] = new int[100];
        int b[] = new int[100];

        // Populate array 'a' with numbers from l to u
        for (int i = l; i <= u; i++) {
            a[x] = i;
            x++;
            
            // Copy elements from array 'a' to array 'b' and print them
            for (int j = 0; j < x; j++) {
                b[j] = a[j];
                System.out.println(b[j]);
            }
        }

        input.close();
    }
}
