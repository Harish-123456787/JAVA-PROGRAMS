import java.util.Arrays;
import java.util.Scanner; 
public class ak 
{ 
    public static void main(String args[]) 
    { 
        System.out.println("Enter the word");
        Scanner input=new Scanner(System.in); 
        String name=input.nextLine(); 
        int len=name.length(); 
        char arr[]=new char[len]; 
        String Alpha; 
        for(int i=0;i<len;i++) 
        { 
            arr[i]=name.charAt(i); 
        } 
        Arrays.sort(arr); 
        for(int i=len-1;i>=0;i--) 
        { 
            System.out.print(arr[i]+" "); 
}
 }
}