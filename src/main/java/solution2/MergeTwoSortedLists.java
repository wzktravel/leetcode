package solution2;

import bean.ListNode;

/**
 * Created by wzk on 15/8/21.
 */
public class MergeTwoSortedLists {


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode head, t1 = l1, t2 = l2;
        if (l1.val > l2.val) {
            t2 = l2.next;
            head = l2;
        } else {
            t1 = l1.next;
            head = l1;
        }
        ListNode cursor = head;

        while (t1 != null && t2 != null) {
            if (t1.val <= t2.val) {
                cursor.next = t1;
                t1 = t1.next;
            } else {
                cursor.next = t2;
                t2 = t2.next;
            }
            cursor = cursor.next;
        }

        while (t1 != null) {
            cursor.next = t1;
            t1 = t1.next;
            cursor = cursor.next;
        }

        while (t2 != null) {
            cursor.next = t2;
            t2 = t2.next;
            cursor = cursor.next;
        }

        return head;
    }

}
