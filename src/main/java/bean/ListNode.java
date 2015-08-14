package bean;

/**
 * Created by wangzhengkun on 2015/8/14.
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    @Override
    public String toString() {
        String s = val + " >> ";
        if (next != null) {
            s += next.toString();
        }
        return s;
    }
}
