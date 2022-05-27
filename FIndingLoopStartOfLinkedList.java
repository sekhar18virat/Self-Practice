/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
//         Base case when head is null or only one node is present. then we return null
        if(head == null || head.next == null)
            return null;
//         Intializing the slowPtr
        ListNode slowPtr = head;
//         Intializing the fast Ptr
        ListNode fastPtr = head;
//         Iterating the Fast Ptr and SlowPtr to find cycle.
        while(fastPtr!=null && fastPtr.next!= null){
//             Iterating the slow Ptr by using one by one
            slowPtr = slowPtr.next;
//             Fast pointer moving two nodes at a time.
            fastPtr = fastPtr.next.next;
//             If the loop is found 
            if(fastPtr == slowPtr){
//                 If the loop is found then slow and head will be at equal distance from the node that has loop
                while(head != slowPtr){
                    head = head.next;
                    slowPtr = slowPtr.next;
                }
//                 now the slow ptr will be at the loop starting point
                return slowPtr;
            }
        }
        return null;
    }
}