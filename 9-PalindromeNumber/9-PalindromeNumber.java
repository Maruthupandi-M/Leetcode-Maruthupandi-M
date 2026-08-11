// Last updated: 11/08/2026, 14:20:24
class Solution {
    public boolean isPalindrome(int x) {
        int i,d,ans=0;
        int temp=x;
        if(temp<0){
            return false;
        }
        while(x!=0){
            d=x%10;
            ans=ans*10+d;
            x=x/10;

        }
        if(temp==ans){
            return true;
        }
        else{
            return false;
        }
    }
}