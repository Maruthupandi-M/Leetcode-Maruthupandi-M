// Last updated: 11/08/2026, 14:20:07
class Solution {
    public int strStr(String haystack, String needle) {
        // char[] ch1 = haystack.toCharArray();
        // char[] ch2 = needle.toCharArray();
        // int c=0;
        // for(int i=0;i<ch2.length;i++){
        //     if(ch1[i] == ch2[i])
        //         c++;
        // }
        boolean ans = haystack.contains(needle);
        if(!ans)
            return -1;
        else
            return haystack.indexOf(needle);
       
    }
}