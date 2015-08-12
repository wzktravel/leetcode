package solution;

import java.util.List;
import java.util.Scanner;

/**
 * Created by wzk on 15/5/31.
 */
public class ArrayRevert {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String lineCountS = stdin.nextLine();
        int lineCount = 0;
        if (!isEmpty(lineCountS)) {
            lineCount = Integer.parseInt(lineCountS);
        }
        if (lineCount > 0) {
            for (int i = 0; i < lineCount; i++) {
                String nextLine = stdin.nextLine();
                if (!isEmpty(nextLine)) {
                    int fCout = Integer.parseInt(nextLine);

                }
            }
        }
    }

    public int revert() {
        int count = 0;




        return count;
    }

    private static boolean check(List<Integer> list) {
        return false;
    }


    private static boolean isEmpty(String s) {
        if (s == null || s.trim().length() < 1) {
            return true;
        }
        return false;
    }

}
