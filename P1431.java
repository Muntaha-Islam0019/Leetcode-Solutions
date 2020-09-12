import java.util.*;

class P1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> finalList = new ArrayList<Boolean>();

        int highest = candies[0];
        for (int i = 1; i < candies.length; i++) 
            if (candies[i] > highest) 
                highest = candies[i];

        for (int j = 0; j < candies.length; j++) 
            candies[j] = candies[j] + extraCandies;

        for (int k = 0; k < candies.length; k++) 
            if (candies[k] >= highest)
                finalList.add(true);
            else
                finalList.add(false);
        
        return finalList;
    }
}