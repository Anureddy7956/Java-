// leaders in an array
import java.util.*;
class Solution {
    public List<Integer> leaders(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int max=nums[nums.length-1];
        result.add(max);
        
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>max){
                result.add(nums[i]);
                max=nums[i];
            }
        }
        Collections.reverse(result);
        return result; // rightmost element is always a leader
    }
}
