package solution;

import bean.ListNode;

/**
 * Created by wangzhengkun on 2015/8/14.
 */
public class DeleteNodeInALinkedList {

    public void deleteNode(ListNode node) {
        if (node == null) {
            return;
        }
        ListNode next = node.next;
        node.val = next.val;
        node.next = next.next;
    }

}
