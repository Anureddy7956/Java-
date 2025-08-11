import java.util.Random;
import java.util.Scanner;
public class random {
    public static void main(String[] args) {
    Scanner User_input= new Scanner(System.in);
    Random rand = new Random();//picks the random number
    System.out.println("Can you guess the number between 1 to 100  ");
    int random; //declaration
    random = rand.nextInt(100)+1;//intialisation 
    System.out.println("Guessed number is: " + random);
    }
}
