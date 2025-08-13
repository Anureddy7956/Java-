import java.util.Scanner;
public class fizz_buzz {
    public static void main(String args[]){
    Scanner in= new Scanner(System.in);
    System.out.print("Enter the number: ");  
    int num  = in.nextInt();
     
    if (num % 3 ==0 && num % 5 ==0){
        System.out.println("FizzBuzz");
    }
    else if ( num %3 == 0 ) {
        System.out.println("Fizz");
    }
    else if ( num % 5==0){
        System.out.println("Buzz");
    }
    }
}
