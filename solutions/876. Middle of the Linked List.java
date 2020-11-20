/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        
        if(head.next==null)
            return head;
        ListNode temp=head;
        
        int count=0;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        ListNode temp2=temp;
        int count2=0;
        
        count= count/2;
       // System.out.println("count is "+count );
        while(temp!=null)
        {
            count2++;
            if(count2==count)
            {
                temp=temp.next;
                return temp;
            }
            temp=temp.next;
        }
