package solution;

/**
 * Created by wzk on 15/3/7.
 */
public class ZigZagConversion {

    public String convert(String s, int nRows) {
        if (s == null || s.length() == 0) {
            return "";
        }
        if (s.length() == 1 || nRows <= 1) {
            return s;
        }
        StringBuilder ss = new StringBuilder();

        int base = (2 * (nRows - 1));
        double ln = s.length();
        int blockCount = (int)Math.ceil(ln / base);

        for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < blockCount; j++) {
                if ((j * base + i) < ln) {
                    ss.append(s.charAt(j * base + i));
                }
                if (i > 0 && i < nRows - 1 && ((j + 1) * base - i) < ln) {
                    ss.append(s.charAt((j + 1) * base - i));
                }
            }
        }

        return ss.toString();
    }

}
