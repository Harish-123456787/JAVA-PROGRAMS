import java.util.Scanner;
public class l{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a[]={1,34,5,6,3,100,42};
        int m,n,i,j;
        int len=a.length;
        int temp;
        for(i=0;i<len;i++)
        {
            for(j=i+1;j<len;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        
        System.out.print(" "+len);

        }    
        

    }
}