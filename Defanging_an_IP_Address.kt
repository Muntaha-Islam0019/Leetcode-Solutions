class Solution {
    fun defangIPaddr(address: String): String {
        
        var stringToReturn: String
        stringToReturn = ""
        
        for(char in address) {
            if(char != '.') {
                stringToReturn += char
            } else {
                stringToReturn += "[$char]"
            }
        }
            
        return stringToReturn
    }
}