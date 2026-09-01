import java.util.Scanner;
// using charAt()  -> returns specific index of the string
public class StrChar {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String FirstName=sc.nextLine();
        System.out.print("Enter the last name: ");
        String LastName= sc.nextLine();
        String fullname = FirstName + LastName;
        
        printLetters(fullname);
    }
}
