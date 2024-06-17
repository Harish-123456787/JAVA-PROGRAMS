import java.util.Scanner;
public class mul{
    public static void main(String args[])
    {
        Scanner input=new Scanner (System.in);
        int i,n,m;
        System.out.println("M=");
        m=input.nextInt();
        System.out.println("N=");
        n=input.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println(+m+"*" +i+"=" +i*m);
        }
    }
}