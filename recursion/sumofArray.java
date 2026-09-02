public class sumofArray {

    // sum of digits
    static int sum(int arr[],int i) {

        // Base condition
        if (i==arr.length) {
            return 0;
        }
        return arr[i]+ sum(arr,i+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int res = sum(arr,0);
        System.out.println(res);
    }
}