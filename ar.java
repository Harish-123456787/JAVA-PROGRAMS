import java.util.Arrays;
import java.util.Scanner;
public class ar{
    public static void main(String[] args){
        int a[]={23,34,1,7,3,100,19},m;
        
        int len=a.length;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the Mth maximum number");
        m=input.nextInt();
        Arrays.sort(a);
        System.out.println(a[len-m]);


    }
}