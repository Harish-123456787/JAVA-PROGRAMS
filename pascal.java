
public class pascal {
    public static void main(String[] args) {
        int n =3,i,j,s,a=1; 
        
        for (i = 0; i<n; i++) {
            for(s=i;s<=n-i;s++)
            {
                System.out.print("  ");

            } 
            for(j=0;j<=i;j++)
            {
                System.out.print(j+1 );
                System.out.print(" ");
            }
            System.out.println();
        
    }
}
}
            
