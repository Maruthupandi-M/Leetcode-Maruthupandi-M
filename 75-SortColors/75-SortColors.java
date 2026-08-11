// Last updated: 11/08/2026, 14:19:40
class Solution {
  public void sortColors(int[] nums) {
    int zero = -1;
    int one = -1;
    int two = -1;

    for (final int num : nums)
      if (num == 0) {
        nums[++two] = 2;
        nums[++one] = 1;
        nums[++zero] = 0;
      } else if (num == 1) {
        nums[++two] = 2;
        nums[++one] = 1;
      } else {
        nums[++two] = 2;
      }
  }
}