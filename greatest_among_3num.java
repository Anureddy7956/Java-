import java.util.Scanner;
public class greatest_among_3num {
    public static void main(String[] args) {
        System.out.print("Enter the three numbers: " );
        Scanner in =new Scanner(System.in);
        int a=in.nextInt() ;
        int b=in.nextInt() ;
        int c=in.nextInt() ;
        int max = a;
        if (b>max){
            max=b;
        }
        if(c>max){
            max=c;
        } else{
            max=a;
        }
        System.out.println("The greatest number among the three  number is " + max);

    }
}
