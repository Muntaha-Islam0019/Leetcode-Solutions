class Solution:
    def minSubsequence(self, nums):
        nums.sort(reverse=True)
        sum_n=sum(nums)
        l=len(nums)
        total=0
        ans=[]
        for i in nums:
            total+=i
            ans.append(i)
            if (sum_n-total)<total:
                break
        return ans