package solution;

import bean.ListNode;

import java.util.HashMap;

/**
 * Created by wangzhengkun on 2015/8/17.
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        HashMap<ListNode, Boolean> map = new HashMap<ListNode, Boolean>();
        ListNode tmp = head;
        while (tmp != null) {
            if (map.get(tmp) != null && map.get(tmp)) {
                return true;
            } else {
                map.put(tmp, true);
            }
            tmp = tmp.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head, slow = head;

        while(true) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            slow = slow.next;

            if (fast == null || slow == null) {
                return false;
            }
            if (fast == slow) {
                return true;
            }
        }
    }

}
