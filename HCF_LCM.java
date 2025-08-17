import java.util.Scanner;
// finding HCF and LCM 
public class HCF_LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.print("Enter the a and b: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int x=a;
        int y=b;
        int hcf;
        int r; // reminder
        // LCM
        while (b!=0) { 
            r = a % b;
            a = b;
            b = r;
        }
        int lcm=a;
        System.out.println("LCM is "+ lcm);
        // HCF
        hcf = (x*y) / lcm;
        System.out.println("HCF is " + hcf);
        }
}   
