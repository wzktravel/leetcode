package solution2;

import bean.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wzk on 15/8/22.
 */
public class MergeTwoSortedListsTest {

    ListNode head = null;
    ListNode l2 = null;

    @Before
    public void before() {
        head = new ListNode(10);
//        head.next = new ListNode(11);
//        head.next.next = new ListNode(30);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

//        l2 = new ListNode(8);
//        l2.next = new ListNode(12);
    }

    @Test
    public void test() {
        System.out.println(toString(head));
        System.out.println(toString(l2));

        MergeTwoSortedLists mt = new MergeTwoSortedLists();
        ListNode ret = mt.mergeTwoLists(head, l2);

        System.out.println(toString(ret));
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
