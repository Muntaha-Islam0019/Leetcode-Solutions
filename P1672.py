import itertools


class Solution(object):
    def maximumWealth(self, accounts):
        return max(itertools.imap(sum, accounts))
