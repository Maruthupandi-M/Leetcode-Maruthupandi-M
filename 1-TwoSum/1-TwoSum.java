// Last updated: 11/08/2026, 14:20:33
class Solution {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numToIndex = new HashMap<>();

    for (int i = 0; i < nums.length; ++i) {
      if (numToIndex.containsKey(target - nums[i]))
        return new int[] {numToIndex.get(target - nums[i]), i};
      numToIndex.put(nums[i], i);
    }

    throw new IllegalArgumentException();
  }
}