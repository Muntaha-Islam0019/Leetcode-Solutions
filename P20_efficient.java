import java.util.Deque;
import java.util.Map;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Map<Character, Character> map = Map.of(
                '(', ')',
                '{', '}',
                '[', ']');

        Deque<Character> stack = new java.util.ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                stack.push(c);
            } else if (map.containsValue(c)) {
                if (stack.isEmpty() || map.get(stack.pop()) != c) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}