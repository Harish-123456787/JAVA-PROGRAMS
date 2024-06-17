import java.util.Scanner;
public class list{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int i,j,n;
        int l=1;
        int u=10;
        int x=0;
        int y=0;
        int f[]=new int[100];
        int a[]=new int[100];
        int b[]=new int[100];
        for(i=l;i<=u;i++)
        {
            a[x]=i;
            x++;
            
        }
        for (i = 0;i < x; i++) {
            b[i] = a[i]*a[i];
            

        }for (i = 0;i < x; i++)
        {
            if(b[i]<=40){
                f[y]=b[i];
                y++;
                System.out.println(f[i]);


            }


        }

        

        

        

        
    }
}