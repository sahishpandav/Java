package LinkedList;

public class middle {
    public static ListNode findMiddle(ListNode head){
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        // Find the middle ListNode
        ListNode middleNode = findMiddle(head);

        // Display the value of the middle ListNode       
        System.out.println("The middle ListNode value is: " + middleNode.data);
    }
}
