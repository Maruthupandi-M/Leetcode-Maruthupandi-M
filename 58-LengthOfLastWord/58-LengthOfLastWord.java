// Last updated: 11/08/2026, 14:19:52
class Solution {
  public int lengthOfLastWord(String s) {
    int i = s.length() - 1;

    while (i >= 0 && s.charAt(i) == ' ')
      --i;
    final int lastIndex = i;
    while (i >= 0 && s.charAt(i) != ' ')
      --i;

    return lastIndex - i;
  }
}