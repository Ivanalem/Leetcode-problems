import java.util.ArrayDeque;


public class ValidParentheses {
    public boolean isValid(String s) {
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            // push opening brackets
            if (c == '(' || c == '[' || c == '{') {
                deque.push(c);
            } else {
                // if stack is empty or pair does not match
                if (deque.isEmpty()){
                    return false;
            }
                char top = deque.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        // valid only if no unmatched brackets remain
        return deque.isEmpty();
    }
}
