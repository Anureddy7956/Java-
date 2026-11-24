// brute force solution 
class Solution {
    public int secondLargestElement(int[] nums) {
    int largest=nums[0];
    int slarge=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>largest){
            largest=nums[i];
        }
    }
    for(int i=0;i<nums.length;i++){
        if(nums[i]<largest && nums[i]>slarge){
            slarge=nums[i];
        }
    }
    if(slarge==Integer.MIN_VALUE){
        return -1;
    }
    return slarge;
    }
}
