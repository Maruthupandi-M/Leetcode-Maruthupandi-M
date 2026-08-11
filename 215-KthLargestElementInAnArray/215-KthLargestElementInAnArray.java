// Last updated: 11/08/2026, 14:18:27
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int p=0;
        for(int ele : nums)
            pq.add(ele);
        for(int i=0;i<k;i++)
            p = pq.poll();
        return p;
        
    }
}