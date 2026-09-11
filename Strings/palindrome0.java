// check the string is palindrome or not
import java.util.*;
public class palindrome0 {
    public static boolean ispalindrome(String str){
        str = str.toLowerCase();
        String rev="";
        for(int i =str.length() -1; i>=0 ; i--){
        rev+=str.charAt(i);
        }
        return str.equals(rev);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str=sc.nextLine();

        if(ispalindrome(str)){
            System.out.println("the string "+ str +" is palindrome");
        }
        else{
            System.out.println("the string "+ str +" is not palindrome");
        }
     }
}
