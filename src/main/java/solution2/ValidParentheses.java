package solution2;

import java.util.Stack;

/**
 * Created by wangzhengkun on 2015/8/21.
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null || s == "") {
            return true;
        }
        int length = s.length();
        if (length % 2 == 1) {
            return false;
        }
        char f = s.charAt(0);
        if (f == ')' || f == ']' || f == '}') {
            return false;
        }
        char l = s.charAt(s.length() - 1);
        if (l == '(' || l == '[' || l == '{') {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char cc = stack.pop();
                if (c == ')' && cc != '(') {
                    return false;
                } else if (c == ']' && cc != '[') {
                    return false;
                } else if (c == '}' && cc != '{') {
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }

}
