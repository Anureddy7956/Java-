import java.util.Scanner;
// Multiplication table
public class multi {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        for(int i=1;i<=10;i++){
            int product=n*i;
        System.out.println(n + "×" + i + "=" + product ); // unicode U+00D7 -> ×
        }
    }
}
