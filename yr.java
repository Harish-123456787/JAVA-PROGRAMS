import java.util.Scanner;
public class yr{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int years,totaldays,weeks,remainingdays,days;
        System.out.println("enter the number of days");
        totaldays=input.nextInt();
        years=totaldays/365;
        remainingdays=totaldays%365;
        weeks=remainingdays/7;
        days=remainingdays%7;
        System.out.println(totaldays+"years="+years+" remaining days="+remainingdays+" weeks="+weeks+"days="+days);
    }
}