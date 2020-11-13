class Solution:
    def sortArrayByParity(self, A: List[int]) -> List[int]:
        odd = []
        even = []
        
        for item in A:
            if (item % 2 == 0):
                even.append(item)
            else:
                odd.append(item)

        newList = even + odd
        
        return newList   
