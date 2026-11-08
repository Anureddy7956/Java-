class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;// -2147483648 smallest possible integer
        for(int i=0 ; i<nums.length; i++){
            sum+=nums[i];
            max=Math.max(max , sum);

            if(sum<0){
                sum=0;//reset 
            }
        }
        return max;
    }
}
