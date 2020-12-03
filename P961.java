import java.util.*;

class P961 {
    public int repeatedNTimes(int[] A) {
        Set<Integer> seenNumbers = new HashSet<>();
        for (int num : A) {
            if (seenNumbers.contains(num)) {
                return num;
            }
            seenNumbers.add(num);
        }
        return 0;
    }
}