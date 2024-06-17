import java.util.Scanner;
public class fib{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int fib,n1=0,n2=1,n3,i,n;
        System.out.println("enter the number");
        n=input.nextInt();
        for(i=0;i<=n;i++){
            n3=n1+n2;
            n1=n2;
            n2=n3;
        
            System.out.println("fibonacci series= "+n3);
        }

    }
}