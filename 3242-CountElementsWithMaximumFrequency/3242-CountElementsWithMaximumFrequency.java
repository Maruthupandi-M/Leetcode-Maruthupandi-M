// Last updated: 11/08/2026, 14:14:34
class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            int c=0;
           for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
                
           } 
           arr[i]=c;
        }
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        int ans=0;
            for(int i=0;i<arr.length;i++){
            if(arr[i]==max)
                ans++;
        }

        return ans;
    }
}