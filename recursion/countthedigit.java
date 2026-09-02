public class countthedigit {

    // Count number of digits
    static int digit(int n) {

        // Base condition
        if (n == 0) {
            return 0;
        }

        return 1 + digit(n / 10);
    }

    public static void main(String[] args) {
        int res = digit(1235345);
        System.out.println(res);
    }
}