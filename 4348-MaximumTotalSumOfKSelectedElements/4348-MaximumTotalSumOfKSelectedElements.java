// Last updated: 11/08/2026, 14:14:05
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        for(int i=n-1;i>=n-k;i--){
            long x = nums[i];
            if(x*(long)mul>x)
                ans+=x*(long)mul;
            else
                ans+=x;
            mul--;
            
        }
        return ans;
    }
}