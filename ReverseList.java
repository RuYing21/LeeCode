package leeCode;

public class ReverseList {
    public static void main(String[] args) {
        ReverseList rs  = new ReverseList();
        int[] a  = new int[]{1, 2, 3, 4, 5};
//        ListNode Listnode = new ListNode(0);    //创建首节点，节点的val是0.
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        showLink(rs.reverseList(n1));

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next ;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        return prev;
    }

    public static class ListNode{
        int val;
        ListNode next ;
        ListNode(int val){
            this.val = val;
            next = null;
        }
        ListNode(int val,ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    private static void showLink(ListNode node) {
        while (node != null) {
            System.out.printf("%d ---> ", node.val);
            node = node.next;
        }
        System.out.printf("%s%n", "null");
    }

}
