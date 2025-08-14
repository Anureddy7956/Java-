
import java.util.Scanner;

public class case_checking {
    public static void main(String[] args) {
        System.out.print("enter the letter: ");
      
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        //.trim() - method remove the white spaces


        if (ch>='a' && ch<='z') {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
    
}
