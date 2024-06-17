import java.util.Scanner;
public class arm{
    public static void main(String[] args)
    {
        int rem,n,a,arm=0;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        a=input.nextInt();
        n=a;
        while(n!=0)
        {
            rem=n%10;
            arm=arm+(rem*rem*rem);
            n=n/10;
        }
        if(n==a)
        {
            System.out.println("armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }


    }
