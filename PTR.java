import java.util.Scanner;
public class PTR {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        double p = in.nextDouble();
        System.out.print("Enter the Time: ");
        double t = in.nextDouble();
        System.out.print("Enter the Rate:");
        double r = in.nextDouble();
        double SI;
        SI = p * t * r/ 100; 
        System.out.println("Simple Intrest is "+SI);

    }
}
