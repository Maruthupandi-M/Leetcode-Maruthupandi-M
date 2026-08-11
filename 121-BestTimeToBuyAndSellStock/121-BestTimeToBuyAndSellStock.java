// Last updated: 11/08/2026, 14:19:17
class Solution {
  public int maxProfit(int[] prices) {
    int sellOne = 0;
    int holdOne = Integer.MIN_VALUE;

    for (final int price : prices) {
      sellOne = Math.max(sellOne, holdOne + price);
      holdOne = Math.max(holdOne, -price);
    }

    return sellOne;
  }
}