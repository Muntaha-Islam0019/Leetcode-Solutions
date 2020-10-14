class P1614 {
    public int maxDepth(String s) {

        int ans = 0;
        int d = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') ans = (int) Math.max(ans, ++d);
            else if (c == ')') --d;
        }

        return ans;
    }
}