import collections
class Solution:
   def destCity(self, paths):
       
    hashtable = collections.defaultdict(str)
    ls = []
    
    for a,b in paths:
        hashtable[a] = b
        ls += a,
        ls += b,
        
    for ans in ls:
        if hashtable[ans] == "":
            return ans
