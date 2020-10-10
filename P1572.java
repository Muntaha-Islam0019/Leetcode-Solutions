class P1572 {
    public int diagonalSum(int[][] mat) {
        
        // Will be summing the position and its duplicate from the other side. Think of a X.
        int summation = 0;
        int size = mat.length;

        int i = 0;
        while (i < size) {

            summation += mat[i][i];

            if (i != size - i - 1) {
                summation += mat[i][size - i - 1];
            }

            i++;
        }
        
        return summation;
    }
}