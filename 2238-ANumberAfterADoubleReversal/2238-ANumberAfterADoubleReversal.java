// Last updated: 11/08/2026, 14:15:19
class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int d,ans=0,ans1=0,d1;
        while(num!=0){
            d=num%10;
            ans=ans*10+d;
            num=num/10;
        }
        while(ans!=0){
            d1=ans%10;
            ans1=ans1*10+d1;
            ans=ans/10;
        }
        return temp==ans1?true:false;

        
    }
}