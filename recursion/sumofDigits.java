public class sumofDigits {

    // sum of digits
    static int digit(int n) {

        // Base condition
        if (n == 0) {
            return 0;
        }

        return (n%10)+ digit(n / 10);
    }

    public static void main(String[] args) {
        int res = digit(12345);
        System.out.println(res);
    }
}