import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        int n,i,j;
        Scanner input=new Scanner(System.in);
        System.out.println("enter t5he number");
        n=input.nextInt();     
                for (i =0; i < n; i++) { 
            for (j=0; j<i+1; j++) {
                System.out.print(i+1); 
            }
            System.out.println();
        }
    }
}
