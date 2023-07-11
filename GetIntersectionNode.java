package leeCode;

public class GetIntersectionNode {
    public static void main(String[] args) {

    }

    public ListNode getInterestionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

    public class ListNode{
        int val;
        ListNode next ;
        ListNode(int x){
            val = x;
            next = null;
        }
    }
}
