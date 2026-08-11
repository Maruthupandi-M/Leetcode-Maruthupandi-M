// Last updated: 11/08/2026, 14:15:53
class Solution {
    public int xorOperation(int n, int start) {
        int ans=0;
            for(int i=0;i<n;i++){
                int cur = start+2*i;
                ans=ans^cur;
            }
            return ans;
        
        
    }
}