package solution;

import bean.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangzhengkun on 2015/8/17.
 */
public class LinkedListCycleTest {

    ListNode root = new ListNode(1);
    @Before
    public void before() {
//        root.next = root;
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
//        root.next.next = root.next;
        root.next.next.next = new ListNode(4);
//        root.next.next.next.next = root.next.next;
//        root.next.next.next.next = new ListNode(5);
    }

    @Test
    public void test() {
        LinkedListCycle llc = new LinkedListCycle();
        boolean hasCycle = llc.hasCycle2(root);

        System.out.println(hasCycle);
    }

}
