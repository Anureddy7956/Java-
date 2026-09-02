// check the string is palindrome or not ex: race car, noon ,madam 
import java.util.Scanner;
public class palindrome {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            int n=str.length();
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value ");
        String str= sc.nextLine();
        System.out.println(isPalindrome(str));
    }
}
