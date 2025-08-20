//Given an integer number n, return the difference between the product of its digits and the sum of its digits.
import java.util.Scanner;
public class ProAndSumOfDigit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=in.nextInt();
        int product=1;
        int sum=0;
        int digit;

        while(n>0){
            digit = n%10;
            product=product*digit;
            sum=sum+digit;
            n=n/10;   
        }
        System.out.println("Sum of the digit: " + sum);
        System.out.println("Product of the digit: " + product);
        int res=sum-product;
        System.out.println("Difference between the Product of the digits and the Sum of the digits: " + res);
    }
}
