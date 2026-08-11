// Last updated: 11/08/2026, 14:15:30
class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();
        int m = word1.length();
        int n = word2.length();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<m+n;i++){
            if(i<m)
            res.append(ch1[i]);
            if(i<n)
            res.append(ch2[i]);

        }
        return res.toString();

    }
}