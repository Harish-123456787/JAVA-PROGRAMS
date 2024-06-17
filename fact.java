import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 0, i, n, f;
        int a[] = new int[100];

        System.out.println("Enter the number");
        n = input.nextInt();
        
        System.out.println("Enter the nth factor");
        f = input.nextInt();

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
                a[x] = i;
                x++;
            }
        }

        System.out.println("Number of factors = " + x);
        
        if (f > 0 && f <= x) {
            System.out.println(f + "th factor of " + n + " = " + a[f - 1]);
        } else {
            System.out.println("N is out of range.");
        }

        input.close();
    }
}
