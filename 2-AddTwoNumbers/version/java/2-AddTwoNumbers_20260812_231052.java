// Last updated: 12/08/2026, 23:10:52
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13    ListNode dummy = new ListNode(0);
14    ListNode curr = dummy;
15    int carry = 0;
16
17    while (l1 != null || l2 != null || carry > 0) {
18      if (l1 != null) {
19        carry += l1.val;
20        l1 = l1.next;
21      }
22      if (l2 != null) {
23        carry += l2.val;
24        l2 = l2.next;
25      }
26      curr.next = new ListNode(carry % 10);
27      carry /= 10;
28      curr = curr.next;
29    }
30
31    return dummy.next;
32  }
33}
34