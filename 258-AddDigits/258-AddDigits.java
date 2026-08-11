// Last updated: 11/08/2026, 14:18:16
class Solution {
    public int addDigits(int num) {
        int d,ans=0,sum,n=num;
        while(n>9){
            sum=0;
            while(n!=0){
                d=n%10;
                sum=sum+d;
                n=n/10;

            }
            n=sum;
        }
       return n; 
    }
}