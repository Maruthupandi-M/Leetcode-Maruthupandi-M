// Last updated: 11/08/2026, 14:20:02
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int ans=0;
        for(int i=0;i<n;i++){ 
            if(nums[i] == target){ 
                return i;
            }
        }
        return -1;
    }
}