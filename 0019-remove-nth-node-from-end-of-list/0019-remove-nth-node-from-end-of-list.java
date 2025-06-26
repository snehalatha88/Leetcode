/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        int cnt=0;
        ListNode temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        if(cnt==n){
            ListNode newHead=head.next;
            // head=null;
            return newHead;
        }
        temp=head;
        int end=cnt-n;
        while(temp!=null){
            end-=1;
            if(end==0)break;
            temp=temp.next;
        }
        ListNode del=temp.next;
        temp.next=temp.next.next;
        // del=null;
        return head;
    }
}