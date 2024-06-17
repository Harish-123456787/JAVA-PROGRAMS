import java.util.Scanner;
public class perfect{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        int n,i,count=0;
        System.out.println("enter the number");
        n=input.nextInt();
        for(i=1;i<n;i++)
        {

            if(n%i==0)
            {
            count=count+i;
        }
    }
        if(count==n)
        {
            System.out.println("perfect number");

        }
        else{
            System.out.println("not a perfect number");
        }
    }
}