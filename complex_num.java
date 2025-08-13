import java.util.Scanner;
public class complex_num {
    public static void main(String[] args) {
        Scanner complex_num = new Scanner(System.in);
        System.out.println("Adding two complex numbers"); // a+ib
        System.out.print("Enter the first real number: ");
        int real1= complex_num.nextInt();
        System.out.print("Enter the second real number: ");
        int real2= complex_num.nextInt();
        int real= real1+real2;
        System.out.print("Enter the first imaginary number: ");
        int img1= complex_num.nextInt();
        System.out.print("Enter the second imaginary number: ");
        int img2= complex_num.nextInt();
        int img= img1 + img2;
        System.out.println("Complex number a+ib = " + real + "+" + "i" + img );
        System.out.println("The real number is a ="+ real);
        System.out.println("The imaginary number is b = "+ img);
    }
} 
