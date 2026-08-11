// Last updated: 11/08/2026, 14:19:36
class Solution {
    public int removeDuplicates(int[] nums) {
        int k =2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k] = nums[i];
                k++; 
            }
        }
        return k;
    }
}