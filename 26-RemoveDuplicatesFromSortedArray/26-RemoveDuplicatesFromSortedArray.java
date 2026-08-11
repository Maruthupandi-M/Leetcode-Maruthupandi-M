// Last updated: 11/08/2026, 14:20:13
class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
            return 0;
        int arrayindex = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[arrayindex]=nums[i];
                arrayindex++; 
            }

                
        }
        return arrayindex;
        
    }
}