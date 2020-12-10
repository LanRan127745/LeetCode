package simple;

public class 反转链表 {
    public ListNode reverseList(ListNode head) {
        // 如果当前链表为空，或者只有一个节点，无需反转直接返回
        if(head == null || head.next == null) return head;

        // 当前节点指向的前一个节点，初始为空
        ListNode pre = null;
        // 用来遍历链表的所有节点，它的下一个节点指向pre
        ListNode cur = head;
        // 临时节点，用来存储cur节点的下一个节点
        ListNode temp = null;

        while(cur != null){
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}

class 反转链表by递归 {
    public ListNode reverseList(ListNode head) {
        // 如果当前链表为空，或者只有一个节点，无需反转直接返回
        if(head == null || head.next == null) return head;

        // newHead表示反转后的新节点
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}