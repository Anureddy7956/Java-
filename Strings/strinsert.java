import java.util.*;
class strinsert{
public static String insertString(String original,String insertstr,int ind){
    String finalstr= " ";
    for(int i=0;i<original.length();i++){
        finalstr+=original.charAt(i);

        if(i==ind){
            finalstr+=insertstr;
        }
    }
    return finalstr;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the original string: ");
        String original=sc.nextLine();
        System.out.println("The original string is "+original);

        System.out.print("Enter the string to insert: ");
        String insertstr =sc.nextLine();
        System.out.println("The inserting string is : "+insertstr);

        System.out.print("Enter the index to insert the string: ");
        int ind=sc.nextInt();
        System.out.println("The index is : "+ind);

        System.out.println("The inserted string is: "+insertString(original,insertstr,ind));
        
    }

}