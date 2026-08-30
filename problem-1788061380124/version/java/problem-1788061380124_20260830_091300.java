// Last updated: 30/08/2026, 09:13:00
1class Solution {
2    public int sumDecoded(long[] nums) {
3        long sum=0;
4        long MOD = 1000000007;
5        for(long n : nums){
6            int width=(int)(n%10);
7            long d=n/10;
8            String s = String.valueOf(d);
9            long x = Integer.parseInt(s.substring(0,width));
10            long y = Integer.parseInt(s.substring(width));
11            long value = 1;
12            while(y>0){
13                if(y%2==1){
14                    value = (value*x)%MOD;
15                }
16                x=(x*x)%MOD;
17                y=y/2;
18            }
19            sum = (sum+value)%MOD;
20        }
21        return (int)sum;
22    }
23}