// finding the intersection of two sorted arrays
class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
      int[] result = new int[Math.min(nums1.length,nums2.length)];
      int i=0;
      int j=0;
      int k=0;
      while(i<nums1.length && j<nums2.length){
        if(nums1[i]<nums2[j]){
            i++;
        }
        else if(nums1[i]>nums2[j]){
            j++;
        }
        else {
            result[k]=nums1[i];

            i++;
            j++;
            k++;
        }
      }
      return Arrays.copyOf(result,k); // creates the copy of the resultant array 
}
}
