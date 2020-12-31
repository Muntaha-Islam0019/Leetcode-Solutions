class Solution:
    def minDeletionSize(self, A):
        cnt=0
        for i in zip(*A):
            if list(i) !=sorted(i):
                cnt+=1
        return cnt