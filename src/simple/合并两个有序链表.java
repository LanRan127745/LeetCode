package simple;
/*
将两个升序链表合并为一个新的 升序 链表并返回。
新链表是通过拼接给定的两个链表的所有节点组成的。

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4
 */
public class 合并两个有序链表{
    public ListNode1 mergeTwoLists(ListNode1 l1, ListNode1 l2) {

        ListNode1  merge = new ListNode1();
        ListNode1  result = merge;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                merge.next = l1;
                l1 = l1.next;
            } else{
                merge.next = l2;
                l2 = l2.next;
            }
            merge = merge.next;
        }

        merge.next = l1 != null ? l1 : l2;
        return result.next;
    }
}

class 合并两个有序链表by递归{
    public ListNode1 mergeTwoLists(ListNode1 l1, ListNode1 l2) {

        ListNode1  merge = new ListNode1();
        ListNode1  result = merge;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                merge.next = l1;
                l1 = l1.next;
            } else{
                merge.next = l2;
                l2 = l2.next;
            }
            merge = merge.next;
        }

        merge.next = l1 != null ? l1 : l2;
        return result.next;
    }
}

class ListNode1 {
     int val;
     ListNode1 next;
     ListNode1() {}
     ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
 }