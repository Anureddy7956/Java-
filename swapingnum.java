import java.util.Scanner;
public class swapingnum {
    public static void main(String[] args) {
        Scanner num= new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        int a = num.nextInt();
        System.out.print("Enter the value for b: ");
        int b = num.nextInt();
        int temp;//temporary variable
        temp = a; // temp saves a value 
        a = b; // a saves b value
        b = temp ;//b saves temp value 
        System.out.println(" a= "+a  );
        System.out.println(" b= "+b  );
    }
    
}
