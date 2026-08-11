// Last updated: 11/08/2026, 14:14:31
class Solution {
    public String triangleType(int[] nums) {
        for(int i=0;i<nums.length;i++){

        }
        if(nums[0]+nums[1]<=nums[2] || nums[0]+nums[2]<=nums[1] || nums[1]+nums[2]<=nums[0])
            return "none";
        if(nums[0]==nums[1] && nums[0]==nums[2])
            return "equilateral";
        else if(nums[0] != nums[1] && nums[1]!=nums[2] && nums[0]!=nums[2])
            return "scalene";
        else
            return "isosceles";
    }
}