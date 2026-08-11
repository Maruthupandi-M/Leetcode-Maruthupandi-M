// Last updated: 11/08/2026, 14:19:04
class Solution {
    public String reverseWords(String s) {
        String[] ans = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=ans.length-1;i>=0;i--){
            res.append(ans[i]);
            if(i>0)
                res.append(" ");
        }
        return res.toString();
    }
}