// Last updated: 11/08/2026, 14:13:55
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange = -1;
        int sum = 0;

        for(int num:nums){
            int x = num;
            int max = 0 ;
            int min = 9 ;

            while(x>0){
                int d = x % 10;
                if(d>max) max = d ;
                if(d<min) min = d;
                x /= 10;
                
            }
            int range = max-min;
            if(range > maxRange){
                maxRange= range;
                sum = num;
            }
            else if(range == maxRange){
                sum += num;
            }
        }
        return sum;
        
    }
}