public class BinarySearch {
    // binary search
        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,8,9};
            int target=6;
            int low=0;
            int high=(arr.length)-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[mid]==target){
                    System.out.println(mid);
                    return;
                }
                else if(target>arr[mid]){
                    low=mid+1;
                }else{
                high=mid-1;
                }
            }
            System.out.println("element not found");
    }
}