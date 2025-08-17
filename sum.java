// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        while (true) { 
         System.out.print("Enter number(or x to stop): ");
         String number=in.nextLine();

         if(number.equals("x")){
            break; 

         } else{
            int num=Integer.valueOf(number); // type casting string to int
            sum=sum+num;
         }
        }
        System.out.println("The total Sum "+ sum);
    }
}
