public class recursion {

    static int sum(int n) {
        // Base condition
        if (n < 1) 
            return 1;
        return n*sum(n-1);    
    }
   

    public static void main(String[] args) {
        int res=sum(5);
        System.out.println(res);
    }
}