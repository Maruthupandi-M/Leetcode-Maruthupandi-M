// Last updated: 11/08/2026, 14:20:17
class Solution {
    boolean isMatchingPair(char ch,char top){
        if((ch==']' && top=='[')||(ch==')' && top=='(')||(ch=='}' && top=='{'))
            return true;
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{'||ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty())   //"}{}"
                    return false;
                char top = st.pop();
                if(!isMatchingPair(ch,top))
                    return false;  
            }
        }           // "{{{}}}"
        if(st.isEmpty())
            return true;
      return false;
    }
}