package solution2;

import bean.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wangzhengkun on 2015/8/6.
 */
public class RemoveNthFromEndTest {

    ListNode head = null;

    @Before
    public void before() {
        head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
    }

    @Test
    public void test() {
        RemoveNthFromEnd r = new RemoveNthFromEnd();
        ListNode af = r.removeNthFromEnd(head, 1);
        System.out.println(toString(af));
    }

    public String toString(ListNode af) {
        String s = "";
        ListNode t = af;
        while (t != null) {
            s+=(">>"+t.val);
            t = t.next;
        }
        return s;
    }

}
