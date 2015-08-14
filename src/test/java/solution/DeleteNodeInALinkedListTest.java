package solution;

import bean.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangzhengkun on 2015/8/14.
 */
public class DeleteNodeInALinkedListTest {

    ListNode root = new ListNode(1);
    @Before
    public void before() {
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);
        root.next.next.next.next = new ListNode(5);
    }

    @Test
    public void test() {
        System.out.println(root.toString());
        DeleteNodeInALinkedList d = new DeleteNodeInALinkedList();
        d.deleteNode(root.next.next.next);
        System.out.println(root.toString());
    }

}
