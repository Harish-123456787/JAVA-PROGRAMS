import java.util.Scanner;

public class up {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter * to exit....");
        char c = '0';
        int lower = 0, upper = 0, digit = 0;

        while (c != '*') {
            c = input.next().charAt(0);

            if (c >= 65 && c <= 90) {
                upper = upper + 1;
            } else if (c >= 97 && c <= 122) {
                lower = lower + 1;
            } else if (c >= 48 && c <= 57) {
                digit = digit + 1;
            }
        }

        System.out.println("Lower: " + lower);
        System.out.println("Upper: " + upper);
        System.out.println("Digit: " + digit);
    }
}
