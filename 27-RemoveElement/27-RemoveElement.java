// Last updated: 11/08/2026, 14:20:10
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int index = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}