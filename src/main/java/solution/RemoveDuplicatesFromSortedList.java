package solution;

import bean.ListNode;

/**
 * Created by wzk on 15/8/20.
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode iterator = head;
        ListNode next;
        boolean delete = false;
        while(iterator != null) {
            next = iterator.next;
            delete = false;
            while(next != null && next.val == iterator.val) {
                next = next.next;
                delete = true;
            }
            if (delete) {
                iterator.next = next;
            }
            iterator = iterator.next;
        }
        return head;
    }

}
