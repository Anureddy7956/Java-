//167. Two Sum II - Input Array Is Sorted
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;

         while(left<right){ 

            int sum=numbers[left]+numbers[right];
            if(sum==target){
                int[] res = new int[2];
               res[0]=left+1;
               res[1]=right+1;
               return res;
            }
            if(sum>target){
                right-- ;
            }
            else{
                left++ ;
            }
        }
        return new int[0];
    }
}
