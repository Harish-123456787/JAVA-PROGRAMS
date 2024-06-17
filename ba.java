import java.util.Scanner;

class BankAccount {
    String name, type;
    int acc_num;
    double bal;

    BankAccount(String n, int a, String t, double b) {
        name = n;
        acc_num = a;
        type = t;
        bal = b;
    }

    void deposit(double d) {
        if (d > 0) {
            bal = bal + d;
        } else {
            System.out.println("Invalid amount");
        }
    }

    void withdraw(double w) {
        if (w > 0 && w <= bal) {
            bal = bal - w;
        } else {
            System.out.println("Invalid amount");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + acc_num);
        System.out.println("Account Type: " + type);
        System.out.println("Balance: " + bal);
    }
}

public class ba {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String n = input.next();

        System.out.print("Enter Account number: ");
        int a = input.nextInt();

        System.out.print("Enter the type of account: ");
        String t = input.next();

        System.out.print("Enter the balance amount: ");
        double b = input.nextDouble();

        BankAccount bank = new BankAccount(n, a, t, b);

        // Display initial account details
        bank.display();

        // Deposit some amount
        System.out.print("Enter amount to deposit: ");
        double depositAmount = input.nextDouble();
        bank.deposit(depositAmount);

        // Withdraw some amount
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = input.nextDouble();
        bank.withdraw(withdrawAmount);

        // Display updated account details
        bank.display();

        input.close();
    }
}
