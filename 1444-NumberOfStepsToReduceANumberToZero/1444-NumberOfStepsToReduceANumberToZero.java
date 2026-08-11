// Last updated: 11/08/2026, 14:16:12
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num!=0){
            if(num%2==0){
            num=num/2;
            c++;
            }
            else{
            num=num-1;
            c++;
            }
        }
        return c;

    }
}