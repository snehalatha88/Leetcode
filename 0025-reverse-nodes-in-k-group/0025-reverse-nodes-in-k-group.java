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
    static ListNode getnode(ListNode temp,int k){
         k-=1;
         while(temp!=null && k>0){
            k-=1;
            temp=temp.next;
         }
         return temp;
    }
    static ListNode reverseLL(ListNode head){
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null){
            ListNode kthnode=getnode(temp,k);
            if(kthnode==null){
                if(prev!=null){
                   prev.next=temp;
                }
                break;
            }
            ListNode nextNode=kthnode.next;
            kthnode.next=null;
            reverseLL(temp);
            if(temp==head){
             head=kthnode;
            }else{
             prev.next=kthnode;
            }
            prev=temp;
           temp=nextNode;
        }
        return head;
    }
    
}