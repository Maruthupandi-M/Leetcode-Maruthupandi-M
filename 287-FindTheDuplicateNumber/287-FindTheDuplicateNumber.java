// Last updated: 11/08/2026, 14:18:03
class Solution {
    public int findDuplicate(int[] nums) {
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){ 
        //             return nums[i];
            
        //         }
        //     }
            
        // }
        // return -1;
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
        
    }
}