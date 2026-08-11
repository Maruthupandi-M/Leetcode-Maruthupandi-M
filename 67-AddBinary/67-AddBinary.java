// Last updated: 11/08/2026, 14:19:48
import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger n1 =new BigInteger(a,2);
        BigInteger n2 = new BigInteger(b,2);
        BigInteger sum = n1.add(n2);
        String ans = sum.toString(2);
        return ans;
    }
}