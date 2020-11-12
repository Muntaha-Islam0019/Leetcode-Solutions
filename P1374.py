class Solution:
    def generateTheString(self, n):
        ans=[]
        if n%2==0:
            ans=['a' for i in range(n-1)]
            ans.append('b')
        else:
            ans=['a' for i in range(n)]
        return ans