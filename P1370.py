class Solution:
    def sortString(self, s):                
        s = list(s)
        ans = []
        while s:
            temp = list(set(s))  
            temp.sort(key=lambda c: ord(c))  
            for i in temp:
                ans.append(i)
                s.remove(i)
            temp = list(set(s))
            temp.sort(key=lambda c: ord(c), reverse=True)
            for i in temp:
                ans.append(i)
                s.remove(i)
        return ''.join(ans)