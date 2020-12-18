class Solution:
    def arrayPairSum(self, nums):
        nums.sort()
        res = 0
        while nums:
            res += min(nums.pop(), nums.pop())
        return res