// Last updated: 11/08/2026, 14:16:56
class Solution {
    public int fib(int n) {
        int n1=0,n2=1;
        int i,n3=0;
        if(n==0||n==1){
            return n;
        }
        for(i=2;i<=n;i++){
             n3=n1+n2;
            n1=n2;
            n2=n3;
        }        
        return n3;
    }
}