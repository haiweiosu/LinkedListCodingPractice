/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int len1 = 0;
        int len2 = 0;
        if (temp1 == null || temp2 == null){
            return null;
        }
        
        while (temp1 != null){
            len1++;
            temp1 = temp1.next;
        }
        while (temp2 != null){
            len2++;
            temp2 = temp2.next;
        }
        
        int diff = 0; 
        temp1 = headA;
        temp2 = headB;
        
        if (len1 > len2){
            diff = len1 - len2;
            int i = 0; 
            while (i < diff){
                temp1 = temp1.next;
                i++;
            }
        }
        else{
            diff = len2 - len1;
            int j = 0; 
            while (j < diff){
                temp2 = temp2.next;
                j++;
            }
        }
        
        while (temp1 != null && temp2 != null){
            if (temp1.val == temp2.val){
                return temp1;
            }
            else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return null;
    }
}