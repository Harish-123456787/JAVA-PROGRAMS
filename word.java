import java.util.Scanner;
public class word{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String name;
        String empty="";
        int len;
        int i;
        System.out.println("enter the word");
        name=input.nextLine();
        len=name.length();
        for(i=len-1;i>=0;i--){
            empty=empty+name.charAt(i);
        }
        System.out.println(" reversed word="+empty);

    }
}