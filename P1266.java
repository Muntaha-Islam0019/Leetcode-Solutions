class P1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int noOfRows = points.length;
        int minTime = 0;

        for (int i = 0; i < noOfRows - 1; i++) {
            
            // Taking difference on x and y coordinates between the current point and next point in the given array; thats why its (i + 1). Also, here at 0, the x poition or column position and 1 the y poition or the row position lies.
            int xDifference = Math.abs(points[i][0] - points[i + 1][0]);
            int yDifference = Math.abs(points[i][1] - points[i + 1][1]);

            minTime += Math.max(xDifference, yDifference);
        }

        return minTime;
    }
}