import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String name = input.nextLine();
        String empty = "";
        int len = name.length();
        
        for (int i = len - 1; i >= 0; i--) {
            empty = empty + name.charAt(i);
        }
        
        System.out.print("Reversed word: " + empty);
        input.close();
    }
}
