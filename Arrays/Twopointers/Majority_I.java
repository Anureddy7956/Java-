//boyer - moore voting algorithm
// majority occurance of an element in an array

class Solution {
    public int majorityElement(int[] nums) {
        int can=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                can=nums[i];
            }
            if(nums[i]==can){
                count++;
            }
            else{
                count--;
            }
        }
        return can;
    }
}
