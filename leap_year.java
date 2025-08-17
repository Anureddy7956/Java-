import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year=in.nextInt();
        if (year%400==0){
            System.out.println("It's a leap year");
        }
        else if(year%100==0){
            System.out.println("Not a leap year ");
        }
        else if(year%4==0){
            System.out.println("It's a leap year");
        }
        else{
            System.out.println("Not a leap year");
        }

    }
}
