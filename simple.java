import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        int p, n;
        double sim;
        char age;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        p = input.nextInt();
        System.out.println("Enter the number of months: ");
        n = input.nextInt();
        System.out.println("Is the customer a senior citizen? (y/n): ");
        age = input.next().charAt(0);

        if (age == 'y' || age == 'Y') {
            sim = p * n * 10 / 100.0;
            System.out.println("Simple interest: " + sim);
        } else if (age == 'n' || age == 'N') {
            sim = p * n * 10 / 100.0;
            System.out.println("Simple interest: " + sim);
        } else {
            System.out.println("Invalid input for age.");
        }

        
    }
}
