// Last updated: 11/08/2026, 14:14:35
class Solution {
  public int minimumAddedCoins(int[] coins, int target) {
    int ans = 0;
    int i = 0;     
    long miss = 1; 

    Arrays.sort(coins);

    while (miss <= target)
      if (i < coins.length && coins[i] <= miss) {
        miss += coins[i++];
      } else {
        miss += miss;
        ++ans;
      }

    return ans;
  }
}