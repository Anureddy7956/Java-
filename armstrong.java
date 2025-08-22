import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=in.nextInt();
        int num=n;// Original num
        int sum=0;
        int count=0;
        
        while(num>0){ // counting the digits
             num=num/10; // last two digits
            count++;
        }
        num=n; // reset to original num
        while(num>0){
            int digit=num % 10;
            int power =1;

        for(int i=0; i<count;i++){
            power=power*digit;
        } 
        sum=sum+power;
        num=num/10; // last two digits 
    }
     if (sum==n){
              System.out.println("It's a armstrong number");  
            }
            else{
                System.out.println("Not a armstrong number");
            }
}
}
