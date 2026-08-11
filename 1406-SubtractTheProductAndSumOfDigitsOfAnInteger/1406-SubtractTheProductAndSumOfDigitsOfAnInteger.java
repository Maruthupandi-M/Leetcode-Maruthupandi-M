// Last updated: 11/08/2026, 14:16:16
class Solution {
    public int subtractProductAndSum(int n) {
        int d,sum=0,ans=1;
        while(n!=0){
            d=n%10;
            ans=ans*d;
            sum=sum+d;
            n=n/10;
        }
        int result;
        result=ans-sum;
        return result;
    }
}