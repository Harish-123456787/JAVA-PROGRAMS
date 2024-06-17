import java.util.Scanner;
public class bi{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int dec;
        System.out.println("enter the number ");
        String bin=input.nextLine();
        dec=Integer.parseInt(bin,2);
        String oct=Integer.toOctalString(dec);
        System.out.println("Decimal number="+dec);
        System.out.println("Octal number="+oct);
    }
}