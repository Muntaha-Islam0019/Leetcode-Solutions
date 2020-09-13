class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        
        result = {}

        for index, number in enumerate(sorted(nums)):
            if number not in result:
                result[number] = index

        return [result[number] for number in nums]
