import java.util.Scanner;
public class StrCon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String FirstName=sc.next();
        System.out.print("Enter the last name: ");
        String LastName= sc.next();
        //string concatination
        System.out.println("The full name is: " + FirstName + " " + LastName);
    }
}
