public class BubbleSort {
    // binary search
static void bubblesort(int arr[],int n){
    for(int i=0;i<n;i++){
        for(int j=1;j<n;j++){
            if(arr[j-1]>arr[j]){
                int temp =arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
        }
    }
}
        public static void main(String[] args) {
            int arr[]={1,2,3,3,5,1,8};
            bubblesort(arr,7);
            //print the sorted array
            for(int k:arr){
                System.out.println(k + " ");
            }
            
    }
}