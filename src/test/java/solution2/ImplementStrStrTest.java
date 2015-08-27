package solution2;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

/**
 * Created by wangzhengkun on 2015/8/27.
 */
public class ImplementStrStrTest {

    Table<String, String, Integer> table = HashBasedTable.create();

    @Before
    public void before() {
        table.put("", "", 0);
        table.put("asd", "", 0);
        table.put("", "123", -1);
        table.put("abcd", "abcd", 0);
        table.put("abcd", "bcd", 1);
        table.put("abcd", "cd", 2);
        table.put("abcd", "a", 0);
        table.put("abcd", "b", 1);
        table.put("abcd", "abb", -1);
        table.put("abcd", "abcde", -1);
    }

    @Test
    public void test() {
        String haystack = "abcd";
        String needle = "abcd";
        int expect = 0;
        int res = 0;

        ImplementStrStr is = new ImplementStrStr();

        Set<Table.Cell<String, String, Integer>> cellSet = table.cellSet();
        for (Table.Cell<String, String, Integer> cell : cellSet) {
            haystack = cell.getRowKey();
            needle = cell.getColumnKey();
            expect = cell.getValue();
            res = is.strStr(haystack, needle);
            System.out.println("haystack: " + haystack + ", needle: " + needle + ", expect: " + expect + ", res: " + res );
            assert(expect == res);
        }
    }

}
