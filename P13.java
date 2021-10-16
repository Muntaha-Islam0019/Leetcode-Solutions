import java.util.Map;
import java.util.HashMap;

class P13 {
    public int romanToInt(String s) {

        int result = 0;
        char[] chars = s.toCharArray();

        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if ((roman.get(chars[i + 1]) <= roman.get(chars[i]))) {
                result = result + roman.get(chars[i]);
            } else {
                result = result - roman.get(chars[i]);
            }
        }

        return result + roman.get(chars[s.length() - 1]);
    }
}