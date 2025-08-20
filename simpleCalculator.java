//Take in two numbers and an operator (+, -, *, /) and calculate the value.(by using if conditions)
import java.util.Scanner;
public class simpleCalculator {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.print("Enter the operator(+,-,*,/): ");
      String op = in.nextLine();        
      System.out.print("Enter the value of a: ");
      int a = in.nextInt();
      System.out.print("Enter the value of b: ");
      int b = in.nextInt();
      if(op.equals("+")){
        System.out.print("Addition: ");
        System.out.println(a+b);
      } 
      else if(op.equals("-")){
        System.out.print("Subraction: ");
        System.out.println(a-b);
      }
      else if(op.equals("*")){
        System.out.print("Multiplication: ");
        System.out.println(a*b);
      }
      else if(op.equals("/")){
        if(b==0){
            System.out.println("Error: Division by Zero is not allowed");
        } else{
            System.out.println("Division: " + (double)(a/b));
        } 
      }
      else{
        System.out.println("Invalid operation ");
      }  
    }
}
