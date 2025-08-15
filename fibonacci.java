import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Finding the nth fibonacci number");
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        int a=0;
        int b=1;
        int count=0;
        while(count<=n){
            int sum = a+b;
            a = b;
            b = sum;
            count++;
        }
        System.out.println(b);
        }
    }

