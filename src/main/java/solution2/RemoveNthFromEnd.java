package solution2;

import bean.ListNode;

/**
 * Created by wangzhengkun on 2015/8/6.
 */
public class RemoveNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (n <= 0 || head == null) {
            return head;
        }
        if (n == 1 && head.next == null) {
            return null;
        }
        ListNode cursor = head;
        ListNode pre = head;
        ListNode tmp = head;
        int t = n;
        while (t > 1) {
            cursor = cursor.next;
            t--;
        }
//        System.out.println("cursor: " + cursor.toString());

        if (cursor != null && cursor.next != null) {
            cursor = cursor.next;
            tmp = tmp.next;
        }

        while (cursor != null && cursor.next != null) {
            cursor = cursor.next;
            pre = pre.next;
            tmp = tmp.next;
        }

//        System.out.println("cursor: " + cursor.toString() );
//        System.out.println("tmp: " + tmp.toString());
//        System.out.println("pre: " + pre.toString());

        if (tmp == head) {
            head = head.next;
        } else {
            pre.next = tmp.next;
        }
//        System.out.println("head: " + head.toString());
        return head;
    }



}


