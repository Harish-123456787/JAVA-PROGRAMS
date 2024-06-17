import java.util.Scanner;

public class rev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        
        while (true) {
            int original = n;
            int reverse = 0;
            
            // Reverse the number
            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n = n / 10;
            }
            
            // Check if the reversed number is a palindrome
            if (reverse == original) {
                System.out.println("Palindrome reached: " + reverse);
                break;
            } else {
                // If not a palindrome, add the original and reversed numbers
                int sum = original + reverse;
                System.out.println(original + " + " + reverse + " = " + sum);
                n = sum; // Set n to the sum for the next iteration
            }
        }
        
        input.close();
    }
}
