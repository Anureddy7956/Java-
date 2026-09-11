// printing the strings which has even words
import java.util.Scanner;
public class evenstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str= sc.nextLine();
        
        String[] words=str.split(" ");

        for (String word:words){
            if(word.length() %2 == 0){
            System.out.println(word);
            }
        }
    }
}
