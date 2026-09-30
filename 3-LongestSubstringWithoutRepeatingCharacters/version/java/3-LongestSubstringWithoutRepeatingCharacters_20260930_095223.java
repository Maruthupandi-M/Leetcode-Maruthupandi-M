// Last updated: 30/09/2026, 09:52:23
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int maxlength=0;
4        for(int i=0;i<s.length();i++){
5            LinkedHashSet<Character> set = new LinkedHashSet<>();
6            for(int j=i;j<s.length();j++){
7                char ch = s.charAt(j);
8                if(set.contains(ch))
9                    break;
10                set.add(ch);
11            }
12            maxlength = Math.max(maxlength,set.size());
13        }
14        return maxlength;
15    }
16}