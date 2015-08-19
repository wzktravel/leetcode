package solution;

import bean.ListNode;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by wzk on 15/8/20.
 */
public class RemoveDuplicatesFromSortedListTest {

    ListNode root = new ListNode(1);
    @Before
    public void before() {
        root.next = new ListNode(2);
        root.next.next = new ListNode(2);
        root.next.next.next = new ListNode(3);
        root.next.next.next.next = new ListNode(3);
    }

    @Test
    public void test() {

        RemoveDuplicatesFromSortedList r = new RemoveDuplicatesFromSortedList();
        ListNode node = r.deleteDuplicates(root);

        System.out.println(node.toString());
    }

}
