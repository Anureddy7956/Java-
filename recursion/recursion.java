public class recursion {
    static void say_hello(int n){
        // Recursion from top to bottom 
        if(n<1){ //base condition
        return;
        }
        System.out.println(" hello");
        say_hello(n-1);
    }
    public static void main(String[] args) {
        say_hello(5);
    }
}
