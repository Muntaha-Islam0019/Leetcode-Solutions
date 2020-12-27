from collections import Counter

class Solution(object):
    def uniqueOccurrences(self, arr):
        counter = Counter(arr).values()
        if(len(counter) == len(set(counter))):
            return True
        else:
            return False
