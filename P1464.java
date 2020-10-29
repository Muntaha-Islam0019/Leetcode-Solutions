public class P1464 {
    public int maxProduct(int[] nums) {

        int a = 0;
        int b = 0;

        for (int num : nums) {

            if (num > a) {
                a = num;
            }

            if (a > b) {
                int ret = a;
                a = b;
                b = ret;
            }
        }
        
        return (a - 1) * (b - 1);
    }
}