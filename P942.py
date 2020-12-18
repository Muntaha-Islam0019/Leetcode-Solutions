class Solution:
    def diStringMatch(self, S):
        low,high=0,len(S)
        ans=[]
        for i in S:
            if i=="I":
                ans.append(low)
                low+=1
            else:
                ans.append(high)
                high-=1
        return ans +[low]
