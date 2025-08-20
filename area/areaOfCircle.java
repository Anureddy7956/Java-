import java.util.Scanner;
public class areaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r= in.nextDouble();
        double area= Math.PI * r*r;
        System.out.println("Area of circle is " +area);
    }
}
