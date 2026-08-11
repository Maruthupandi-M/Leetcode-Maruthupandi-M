// Last updated: 11/08/2026, 14:19:12
class Solution {
    public int singleNumber(int[] nums) {
        int i,ans=0;
        for(i=0;i<nums.length;i++){
            ans=ans^nums[i];
        }
        return ans;
    }
}