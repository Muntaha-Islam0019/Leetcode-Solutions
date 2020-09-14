class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        
        final_list = list()

        for i in range(0, len(nums) - 1, 2):
            final_list += nums[i] * [nums[i + 1]]

        return final_list
