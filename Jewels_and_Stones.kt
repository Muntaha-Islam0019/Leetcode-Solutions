class Solution {
    fun numJewelsInStones(J String, S String) Int {
        
        var counter Int = 0
        
        for(char in J) {
            for(anotherChar in S) {
                if(char == anotherChar) {
                    counter++
                }
            }
        }
        
        return counter
    }
}