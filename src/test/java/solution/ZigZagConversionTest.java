package solution;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.junit.Test;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by wzk on 15/3/7.
 */
public class ZigZagConversionTest {

    ZigZagConversion zzc = new ZigZagConversion();

    @Test
    public void test() {
        String input, expected, result;
        int nRows;
        result = zzc.convert(null, 3);
        assert("".equals(result));

        // row  column value  -->  input nRows expected
        Table<String, Integer, String> t = HashBasedTable.create();
        t.put("", 3, "");
        t.put("PAYPALISHIRING", 1, "PAYPALISHIRING");
        t.put("PAYPALISHIRING", 2, "PYAIHRNAPLSIIG");
        t.put("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR");
        t.put("PAYPALISHIRING", 4, "PINALSIGYAHRPI");

        Iterator<String> rowIt = t.rowKeySet().iterator();
        while (rowIt.hasNext()) {
            input = rowIt.next();
            Map<Integer, String> rowMap = t.row(input);
            nRows = rowMap.keySet().iterator().next();
            expected = rowMap.get(nRows);

            result = zzc.convert(input, nRows);

            assert(expected.equals(result));
        }

    }
}
