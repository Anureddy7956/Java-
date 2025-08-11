import java.util.Scanner;
public class inches_to_cm {
    public static void main(String[] args) {
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many inches: ");
        inch=in.nextInt();
        cm= inch*2.54;
        System.out.print(inch +"in = ");
        System.out.println(cm +"cm");

    }
    
}

